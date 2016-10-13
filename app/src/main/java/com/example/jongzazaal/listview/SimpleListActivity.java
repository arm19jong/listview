package com.example.jongzazaal.listview;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jongzazaal on 30/9/2559.
 */

public class SimpleListActivity extends ListActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_simple);
        //setContentView(R.layout.activity_simple_list);

        String[] items = {"alligator", "goat", "rabbit"};
        ArrayList<String> ar = new ArrayList<String>();
        for (int i=1; i<=10000; i++){
            ar.add("count="+i);
        }

        //setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ar));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.d("COEN268", "Item clicked: " + position);
        if (position == 0){
            Intent i2 = new Intent(getApplicationContext(), alligator.class);
            //i.putExtra("sendTextStr",sendText.getText().toString() );
            startActivity(i2);
        }
        else if (position == 1){
            Intent i2 = new Intent(getApplicationContext(), goat.class);
            //i.putExtra("sendTextStr",sendText.getText().toString() );
            startActivity(i2);
        }
        else{
            Intent i2 = new Intent(getApplicationContext(), class_layout_2.class);
            //i.putExtra("sendTextStr",sendText.getText().toString() );
            startActivity(i2);
        }
    }
}