package com.example.banglaixe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Bien_Bao_Cam extends BaseAdapter {

     Context myContext;
     int myLayout;
     List<FragmentBienBaoCam> arrayBienBaoCam;
    public  Bien_Bao_Cam(Context context, int layout, List<FragmentBienBaoCam> BienBaoCamList){
        myContext = context;
        myLayout = layout;
        arrayBienBaoCam = BienBaoCamList;
    }

    @Override
    public int getCount() {
        return arrayBienBaoCam.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView txtTenBienBao = (TextView) convertView.findViewById(R.id.textViewLoaiBienBao);
        txtTenBienBao.setText(arrayBienBaoCam.get(position).LoaiBienBao);
        TextView txtTenNoiDung = (TextView) convertView.findViewById(R.id.textViewNoiDung);
        txtTenNoiDung.setText((arrayBienBaoCam).get(position).NoiDungBienBao);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageView);
        imgHinh.setImageResource(arrayBienBaoCam.get(position).Hinh);
        return convertView;
    }
}
