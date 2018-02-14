package com.ivoryworks.cipunchingbag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView echoText = findViewById(R.id.text_echo);
        echoText.setText(String.valueOf(System.currentTimeMillis()));
    }
}
