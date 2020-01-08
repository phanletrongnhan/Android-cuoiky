package com.example.banglaixe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.banglaixe.Object.Hoc_Ly_Thuyet_Bien_Bao;
import com.example.banglaixe.R;

import java.util.ArrayList;
import java.util.List;

public class HocLyThuyetBB_Adapter extends BaseAdapter{

    Context myContext;
    int myLayout;
    List<Hoc_Ly_Thuyet_Bien_Bao> arrayHocLToLT;

    public HocLyThuyetBB_Adapter(Context context, int layout, ArrayList<Hoc_Ly_Thuyet_Bien_Bao> hoc_ly_thuyet_bien_baos){
        myContext = context;
        myLayout = layout;
        arrayHocLToLT = hoc_ly_thuyet_bien_baos ;
    }
    @Override
    public int getCount() {
        return arrayHocLToLT.size();
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
//        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        convertView = inflater.inflate(myLayout, null);
//
//        TextView txtTenHocBB = (TextView) convertView.findViewById(R.id.textViewTenHocBB);
//        txtTenHocBB.setText(arrayHocLToLT.get(position).TenHocBB);
//
//        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHocBB);
//        imgHinh.setImageResource(arrayHocLToLT.get(position).Hinh);
//
//        TextView txtNoiDungHocBB = (TextView) convertView.findViewById(R.id.textViewNoiDungHocBB);
//        txtNoiDungHocBB.setText(arrayHocLToLT.get(position).NoiDungHocBB);
//
//        return convertView;
        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.fragment_hoc_lt_knqt, null);
        } else viewProduct = convertView;

        TextView txtTenHoc = (TextView) viewProduct.findViewById(R.id.textViewTenHocLT);
        txtTenHoc.setText(arrayHocLToLT.get(position).TenHocBB);

        TextView txtNoiDungHoc = (TextView) viewProduct.findViewById(R.id.textViewNoiDungHocLT);
        txtNoiDungHoc.setText(arrayHocLToLT.get(position).NoiDungHocBB);
        return viewProduct;
    }
}
