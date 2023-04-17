package com.bichngoc.android_day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_Red)
    TextView tvRed;
    private static final String TAG = MainActivity.class.getName();

    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
//        initView();
        Log.e("tag","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("tag","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("tag","onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("tag","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("tag","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("tag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("tag","onDestroy");
    }

    private void initView() {
//        tvRed = findViewById(R.id.tv_Red);
        ButterKnife.bind(this);
        String tvRedData = tvRed.getText().toString();//vì getText trả về chuỗi char[]
        Log.d(TAG, "init view: " + tvRedData);
        String newData = "Now we are learning Android_day 5";
        tvRed.setText(newData);
        tvRed.setText(12345 + "");//vì int giới hạn giá trị => chuyển sang string bằng cách +""
        Log.d(TAG, "init view: " + tvRed.getText().toString());
    }
}