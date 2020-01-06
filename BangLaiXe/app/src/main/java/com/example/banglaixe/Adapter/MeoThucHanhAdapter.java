package com.example.banglaixe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.banglaixe.Meo_Thuc_Hanh;
import com.example.banglaixe.R;

import java.util.ArrayList;
import java.util.List;

public class MeoThucHanhAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Meo_Thuc_Hanh> arrayMeoTH;

    public MeoThucHanhAdapter(Context context, int layout, ArrayList<Meo_Thuc_Hanh> meoTHList){
        myContext = context;
        myLayout = layout;
        arrayMeoTH = meoTHList;
    }

    @Override
    public int getCount() {
        return arrayMeoTH.size();
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

        TextView txtTenMeoTH = (TextView) convertView.findViewById(R.id.textViewTenTH);
        txtTenMeoTH.setText(arrayMeoTH.get(position).TenMeoTH);

        TextView txtNoiDungMeoTH = (TextView) convertView.findViewById(R.id.textViewNoiDungTH);
        txtNoiDungMeoTH.setText(arrayMeoTH.get(position).NoiDungMeoTH);
        return convertView;
    }
}
