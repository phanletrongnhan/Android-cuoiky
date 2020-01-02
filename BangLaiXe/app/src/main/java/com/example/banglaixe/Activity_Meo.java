package com.example.banglaixe;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

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
