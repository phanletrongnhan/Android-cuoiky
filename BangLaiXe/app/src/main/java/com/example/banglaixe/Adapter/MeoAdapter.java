package com.example.banglaixe.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.banglaixe.Fragment.FragmentMeoThiLyThuyet;
import com.example.banglaixe.Fragment.FragmentMeoThiThucHanh;

public class MeoAdapter extends FragmentStatePagerAdapter {
    private String listTab[] = {"MẸO THI LÝ THUYẾT","MẸO THI THỰC HÀNH"};
    private FragmentMeoThiLyThuyet fragmentMeoThiLyThuyet;
    private FragmentMeoThiThucHanh fragmentMeoThiThucHanh;



    public MeoAdapter(FragmentManager fm){
        super(fm);
        fragmentMeoThiLyThuyet = new FragmentMeoThiLyThuyet();
        fragmentMeoThiThucHanh = new FragmentMeoThiThucHanh();

    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0 ){
            return fragmentMeoThiLyThuyet;
        } else if(position == 1){
            return fragmentMeoThiThucHanh;
        }else{

        }

        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}
