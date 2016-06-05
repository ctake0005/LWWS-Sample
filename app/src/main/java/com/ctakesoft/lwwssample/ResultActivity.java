package com.ctakesoft.lwwssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    public static final String INTENT_KEY_SELECTED_ID = "selected_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String selected = getIntent().getStringExtra(INTENT_KEY_SELECTED_ID);
        Toast.makeText(ResultActivity.this, "selected = " + selected, Toast.LENGTH_SHORT).show();
    }
}
