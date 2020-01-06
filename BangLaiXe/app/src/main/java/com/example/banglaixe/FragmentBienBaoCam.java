package com.example.banglaixe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentBienBaoCam extends Fragment {
    public String LoaiBienBao;
    public String NoiDungBienBao;
    public Integer Hinh;

    public FragmentBienBaoCam(String loaiBienBao, String noiDungBienBao, Integer hinh) {
        LoaiBienBao = loaiBienBao;
        NoiDungBienBao = noiDungBienBao;
        Hinh = hinh;
    }

    public FragmentBienBaoCam(int contentLayoutId, String loaiBienBao, String noiDungBienBao, Integer hinh) {
        super(contentLayoutId);
        LoaiBienBao = loaiBienBao;
        NoiDungBienBao = noiDungBienBao;
        Hinh = hinh;
    }

    private View mRootView;

    public FragmentBienBaoCam() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_bien_bao_cam,container,false);
        return mRootView;
    }
}
