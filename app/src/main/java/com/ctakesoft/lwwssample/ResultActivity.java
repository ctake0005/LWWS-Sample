package com.ctakesoft.lwwssample;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ctakesoft.lwwssample.model.Forecast;
import com.ctakesoft.lwwssample.net.ForecastPublisher;
import com.squareup.picasso.Picasso;

import java.io.IOException;

public class ResultActivity extends AppCompatActivity implements ForecastPublisher.ForecastReceiver {

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

        TypedArray typedArray = getResources().obtainTypedArray(R.array.daily_panel_array);
        for (int i = 0, size = forecast.getForecasts().size(); i < size; i++) {
            LinearLayout layout = (LinearLayout) findViewById(typedArray.getResourceId(i, 0));
            TextView dailyLabel = (TextView) layout.findViewById(R.id.daily_label);
            dailyLabel.setText(getResources().getStringArray(R.array.daily_labels)[i]);
            TextView dailyText = (TextView) layout.findViewById(R.id.daily_text);
            dailyText.setText(forecast.getForecasts().get(i).getTelop());

            // Load the image using the Picasso.
            ImageView dailyImage = (ImageView) layout.findViewById(R.id.daily_image);
            Picasso.with(this).load(forecast.getForecasts().get(i).getImage().getUrl()).into(dailyImage);

            layout.setVisibility(View.VISIBLE);
        }
        mForecastLayout.setVisibility(View.VISIBLE);

        typedArray.recycle();
    }

    @Override
    public void onError(IOException e) {
        mProgressBar.setVisibility(View.GONE);
        mRetryButton.setVisibility(View.VISIBLE);

        Toast.makeText(this, "Network error !!", Toast.LENGTH_SHORT).show();
    }

    private void request() {
        ForecastPublisher.get().request(mSelectedArea);
    }

}
