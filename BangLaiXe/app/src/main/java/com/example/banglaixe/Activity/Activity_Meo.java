package com.example.banglaixe.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.banglaixe.Adapter.MeoAdapter;
import com.example.banglaixe.R;
import com.google.android.material.tabs.TabLayout;

public class Activity_Meo extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meo);
        initView();
    }

    private void initView() {
        viewPager =(ViewPager) findViewById(R.id.vp_meo);
        viewPager.setAdapter(new MeoAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.meoTabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

}
