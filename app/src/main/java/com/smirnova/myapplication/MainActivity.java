package com.smirnova.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage=findViewById(R.id.tvMessage);
        tvMessage.setText(getResources().getString(R.string.message));
        tvMessage.setTextColor(getResources().getColor(R.color.blue);

    }
}