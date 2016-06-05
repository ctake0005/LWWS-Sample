package com.ctakesoft.lwwssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ctakesoft.lwwssample.model.Forecast;
import com.ctakesoft.lwwssample.net.ForecastPublisher;

import java.io.IOException;

public class ResultActivity extends AppCompatActivity implements ForecastPublisher.ForecastReceiver {

    private static final String TAG = ResultActivity.class.getSimpleName();

    public static final String INTENT_KEY_SELECTED_ID = "selected_id";
    private String mSelectedArea;

    private LinearLayout mForecastLayout;
    private Button mRetryButton;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mSelectedArea = getIntent().getStringExtra(INTENT_KEY_SELECTED_ID);

        mForecastLayout = (LinearLayout) findViewById(R.id.forecast_layout);
        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mRetryButton = (Button) findViewById(R.id.retry_button);
        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                request();
                mRetryButton.setVisibility(View.GONE);
                mProgressBar.setVisibility(View.VISIBLE);
            }
        });

        ForecastPublisher.get().setReceiver(this);
        request();
    }

    @Override
    public void onReceive(Forecast forecast) {
        mProgressBar.setVisibility(View.GONE);
        TextView title = (TextView) mForecastLayout.findViewById(R.id.title_text);
        title.setText(forecast.getTitle());
        TextView description = (TextView) mForecastLayout.findViewById(R.id.description_text);
        description.setText(forecast.getDescription().getText());

        mForecastLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void onError(IOException e) {
        mProgressBar.setVisibility(View.GONE);
        mRetryButton.setVisibility(View.VISIBLE);
    }

    private void request() {
        ForecastPublisher.get().request(mSelectedArea);
    }

}
