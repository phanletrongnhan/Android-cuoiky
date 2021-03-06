package com.example.banglaixe.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.banglaixe.Adapter.BienBaoAdapter;
import com.example.banglaixe.R;
import com.google.android.material.tabs.TabLayout;

public class Activity_BienBao extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bien_bao);
        initView();
    }

    private void initView() {
        viewPager =(ViewPager) findViewById(R.id.vp_bienbao);
        viewPager.setAdapter(new BienBaoAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.bienBaoTabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

}
