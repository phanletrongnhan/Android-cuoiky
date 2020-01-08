package com.example.banglaixe.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.banglaixe.Object.Hoc_LT_KNQT;
import com.example.banglaixe.R;

import java.util.ArrayList;
import java.util.List;

public class HocLyThuyetKNQT_Adapter extends BaseAdapter {
    Context myContext;
    List<Hoc_LT_KNQT> arrayHocLToLT;

    public HocLyThuyetKNQT_Adapter(Context context, ArrayList<Hoc_LT_KNQT> hoc_lt_knqts){
        this.myContext = context;
        this.arrayHocLToLT = hoc_lt_knqts ;
    }

    @Override
    public int getCount() {
        return arrayHocLToLT.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayHocLToLT.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.fragment_hoc_lt_knqt, null);
        } else viewProduct = convertView;

        TextView txtTenHoc = (TextView) viewProduct.findViewById(R.id.textViewTenHocLT);
        txtTenHoc.setText(arrayHocLToLT.get(position).TenHocLT);

        TextView txtNoiDungHoc = (TextView) viewProduct.findViewById(R.id.textViewNoiDungHocLT);
        txtNoiDungHoc.setText(arrayHocLToLT.get(position).NoiDungHocLT);
        return viewProduct;
    }
}
