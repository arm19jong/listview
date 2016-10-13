package com.example.jongzazaal.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jongzazaal on 30/9/2559.
 */

public class CustomListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom);
        String[] list = {  "Aerith Gainsborough", "Barret Wallace", "Cait Sith"
                , "Barret Wallace", "Cait Sith"
                , "Cid Highwind", "Cloud Strife", "RedXIII", "Sephiroth"
                , "ZackFair" };

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list);//, resId);

        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }
}