package com.example.jongzazaal.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button layout1;
    Button layout2;
    Button layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1= (Button) findViewById(R.id.layout1);
        layout2 = (Button) findViewById(R.id.layout2);
        layout3 = (Button) findViewById(R.id.layout3);
        layout1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), SimpleListActivity.class);
            //i.putExtra("sendTextStr",sendText.getText().toString() );
            startActivity(i);

        }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), class_layout_2.class);
                //i.putExtra("sendTextStr",sendText.getText().toString() );
                startActivity(i2);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), CustomListViewActivity.class);
                //i.putExtra("sendTextStr",sendText.getText().toString() );
                startActivity(i3);
            }
        });

    }
}
