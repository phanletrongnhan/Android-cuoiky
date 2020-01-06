package com.example.banglaixe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HocLyThuyetKNQT_Adapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Hoc_LT_KNQT> arrayHocLToLT;

    public HocLyThuyetKNQT_Adapter(Context context, int layout, ArrayList<Hoc_LT_KNQT> hoc_lt_knqts){
        myContext = context;
        myLayout = layout;
        arrayHocLToLT = hoc_lt_knqts ;
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
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView txtTenHoc = (TextView) convertView.findViewById(R.id.textViewTenHocLT);
        txtTenHoc.setText(arrayHocLToLT.get(position).TenHocLT);

        TextView txtNoiDungHoc = (TextView) convertView.findViewById(R.id.textViewNoiDungHocLT);
        txtNoiDungHoc.setText(arrayHocLToLT.get(position).NoiDungHocLT);
        return convertView;
    }
}
