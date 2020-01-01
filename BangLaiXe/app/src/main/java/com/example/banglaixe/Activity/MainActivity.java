package com.example.banglaixe.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.banglaixe.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void HLT_click(View view) {
        Intent intent = new Intent(MainActivity.this, activity_hoc_ly_thuyet.class);
        startActivity(intent);
    }

    public void TSH_click(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_ThiSatHach.class);
        startActivity(intent);
    }

    public void BB_click(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_BienBao.class);
        startActivity(intent);
    }

    public void M_click(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_Meo.class);
        startActivity(intent);
    }
}
