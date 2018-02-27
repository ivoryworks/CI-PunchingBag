package com.ivoryworks.cipunchingbag;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer i = null;
        i.toString();

        SharedPreferences.Editor editor = PreferßenceManager.getDefaultSharedPreferences(this).edit();
        editor.commit();

        TextView echoText = findViewById(R.id.text_echo);
        long currentMillis = System.currentTimeMillis();
        if (isEven(currentMillis)) {
            echoText.setText(String.valueOf(System.currentTimeMillis()));
        }
    }

    private boolean isEven(long value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
