package com.example.banglaixe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.banglaixe.Object.Hoc_Ly_Thuyet_VHDD;
import com.example.banglaixe.R;

import java.util.ArrayList;
import java.util.List;

public class HocLyThuyetVH_Adapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Hoc_Ly_Thuyet_VHDD> arrayHocLToLT;

    public HocLyThuyetVH_Adapter(Context context, int layout, ArrayList<Hoc_Ly_Thuyet_VHDD> hoc_ly_thuyet_vhdds){
        myContext = context;
        myLayout = layout;
        arrayHocLToLT = hoc_ly_thuyet_vhdds ;
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
        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.fragment_hoc_lt_knqt, null);
        } else viewProduct = convertView;

        TextView txtTenHoc = (TextView) viewProduct.findViewById(R.id.textViewTenHocLT);
        txtTenHoc.setText(arrayHocLToLT.get(position).TenHocVH);

        TextView txtNoiDungHoc = (TextView) viewProduct.findViewById(R.id.textViewNoiDungHocLT);
        txtNoiDungHoc.setText(arrayHocLToLT.get(position).NoiDungVH);
        return viewProduct;
    }
}
