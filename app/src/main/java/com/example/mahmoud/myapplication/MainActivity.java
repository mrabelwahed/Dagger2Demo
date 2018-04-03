package com.example.mahmoud.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView dateTextView;

    @Inject
    MyExample myExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = (TextView) findViewById(R.id.date_tv);

        ((MyApplication) getApplication()).getMyComponent().inject(this);
        dateTextView.setText((new Date(myExample.getDate())).toString());
    }
}
