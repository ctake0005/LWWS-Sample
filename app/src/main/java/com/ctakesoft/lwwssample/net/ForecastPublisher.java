package com.ctakesoft.lwwssample.net;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;

import com.ctakesoft.lwwssample.model.Forecast;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ForecastPublisher {
    @SuppressWarnings("unused")
    private static final String TAG = ForecastPublisher.class.getSimpleName();
    @SuppressWarnings("unused")
    private final ForecastPublisher self = this;

    public interface ForecastReceiver {
        void onReceive(Forecast forecast);

        void onError(IOException e);
    }

    private static ForecastPublisher sInstance = new ForecastPublisher();

    private OkHttpClient mOkHttpClient;
    private ForecastReceiver mReceiver;

    private ForecastPublisher() {
        mOkHttpClient = new OkHttpClient();
    }

    public static ForecastPublisher get() {
        if (sInstance == null) {
            sInstance = new ForecastPublisher();
        }
        return sInstance;
    }

    public void setReceiver(ForecastReceiver receiver) {
        mReceiver = receiver;
    }

    public void request(String areaId) {
        final Handler handler = new Handler();
        Map<String, String> params = new HashMap<>();
        params.put("city", areaId);

        Request request = new Request.Builder()
                .url(makeUrl(params))
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(final Call call, final IOException e) {
                Log.w(TAG, "onFailure: ", e);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (mReceiver != null) {
                            mReceiver.onError(e);
                        }
                    }
                });
            }

            @Override
            public void onResponse(final Call call, final Response response) throws IOException {
                Log.d(TAG, "onResponse() called with " + "call = [" + call + "], response = [" + response + "]");
                final Forecast forecast = new Gson().fromJson(response.body().charStream(), Forecast.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (mReceiver != null) {
                            mReceiver.onReceive(forecast);
                        }
                    }
                });
            }
        });
    }

    private String makeUrl(Map<String, String> params) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("http")
                .authority("weather.livedoor.com")
                .path("/forecast/webservice/json/v1");
        for (Map.Entry<String, String> param : params.entrySet()) {
            builder.appendQueryParameter(param.getKey(), param.getValue());
        }
        return builder.toString();
    }
}
