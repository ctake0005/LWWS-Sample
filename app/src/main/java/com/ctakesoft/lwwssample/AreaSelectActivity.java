package com.ctakesoft.lwwssample;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaSelectActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static final String INTENT_KEY_SELECTED = "selected";
    private TypedArray mSelectedArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_select);

        int selected = getIntent().getIntExtra(INTENT_KEY_SELECTED, 0);
        TypedArray subArray = getResources().obtainTypedArray(R.array.kanto_sub_array);
        int selectedArraysResId = subArray.getResourceId(selected, 0);
        mSelectedArray = getResources().obtainTypedArray(selectedArraysResId);
        int selectedArrayResId = mSelectedArray.getResourceId(0, 0);

        ListView listView = (ListView) findViewById(R.id.areaList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(selectedArrayResId));
        if (listView != null) {
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(this);
        }

        subArray.recycle();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mSelectedArray.recycle();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ResultActivity.class);
        @SuppressWarnings("ResourceType") int selectedIdsArrayRes = mSelectedArray.getResourceId(1, 0);
        intent.putExtra(ResultActivity.INTENT_KEY_SELECTED_ID, getResources().getStringArray(selectedIdsArrayRes)[position]);
        startActivity(intent);
    }
}
