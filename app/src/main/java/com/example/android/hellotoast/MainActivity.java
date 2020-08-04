package com.example.android.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE =
            "com.example.android.hellotoast.extra.MESSAGE";
    private TextView mMessageCount,mMessageHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mMessageCount = (TextView) findViewById(R.id.show_count);
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = mMessageCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}


