package com.example.dev.angelbookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView desc=(TextView) findViewById(R.id.desc);
        desc.setMovementMethod(new ScrollingMovementMethod());
    }
}
