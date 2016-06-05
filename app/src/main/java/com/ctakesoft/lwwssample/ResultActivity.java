package com.ctakesoft.lwwssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ctakesoft.lwwssample.model.Forecast;
import com.ctakesoft.lwwssample.net.ForecastPublisher;

import java.io.IOException;

public class ResultActivity extends AppCompatActivity implements ForecastPublisher.ForecastReceiver {

    private static final String TAG = ResultActivity.class.getSimpleName();

    public static final String INTENT_KEY_SELECTED_ID = "selected_id";
    private String mSelectedArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mSelectedArea = getIntent().getStringExtra(INTENT_KEY_SELECTED_ID);
        Toast.makeText(ResultActivity.this, "selected = " + mSelectedArea, Toast.LENGTH_SHORT).show();

        ForecastPublisher.get().setReceiver(this);
        request();
    }

    private void request() {
        ForecastPublisher.get().request(mSelectedArea);
    }

    @Override
    public void onReceive(Forecast forecast) {
        if (forecast != null) {
            Toast.makeText(ResultActivity.this, forecast.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onError(IOException e) {

    }
}
