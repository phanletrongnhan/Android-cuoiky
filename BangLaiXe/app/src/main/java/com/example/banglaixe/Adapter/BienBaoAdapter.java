package com.example.banglaixe.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.banglaixe.FragmentBienBaoCam;
import com.example.banglaixe.FragmentBienBaoChiDan;
import com.example.banglaixe.FragmentBienBaoHieuLenh;
import com.example.banglaixe.FragmentBienBaoNguyHiem;
import com.example.banglaixe.FragmentBienBaoPhu;
import com.example.banglaixe.FragmentVachKeDuong;

public class BienBaoAdapter extends FragmentStatePagerAdapter {
    private String listTab[] = {"BIỂN BÁO CẤM","BIỂN BÁO NGUY HIỂM","BIỂN BÁO HIỆU LỆNH","BIỂN BÁO CHỈ DẪN","BIỂN BÁO PHỤ","VẠCH KẺ ĐƯỜNG"};
    private FragmentBienBaoCam fragmentBienBaoCam;
    private FragmentBienBaoNguyHiem fragmentBienBaoNguyHiem;
    private FragmentBienBaoHieuLenh fragmentBienBaoHieuLenh;
    private FragmentBienBaoChiDan fragmentBienBaoChiDan;
    private FragmentBienBaoPhu fragmentBienBaoPhu;
    private FragmentVachKeDuong fragmentVachKeDuong;


    public BienBaoAdapter(FragmentManager fm){
        super(fm);
        fragmentBienBaoCam = new FragmentBienBaoCam();
        fragmentBienBaoNguyHiem = new FragmentBienBaoNguyHiem();
        fragmentBienBaoHieuLenh = new FragmentBienBaoHieuLenh();
        fragmentBienBaoChiDan = new FragmentBienBaoChiDan();
        fragmentBienBaoPhu = new FragmentBienBaoPhu();
        fragmentVachKeDuong = new FragmentVachKeDuong();
    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0 ){
            return fragmentBienBaoCam;
        } else if(position == 1){
            return fragmentBienBaoNguyHiem;
        }else if(position == 2){
            return fragmentBienBaoHieuLenh;
        }else if(position == 3){
            return fragmentBienBaoChiDan;
        }else if(position == 4){
            return fragmentBienBaoPhu;
        }else if(position == 5){
            return fragmentVachKeDuong;
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
