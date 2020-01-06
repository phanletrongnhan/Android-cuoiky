package com.example.banglaixe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.banglaixe.Object.Meo_Ly_Thuyet;
import com.example.banglaixe.R;

import java.util.ArrayList;
import java.util.List;

public class MeoLyThuyetAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Meo_Ly_Thuyet> arrayMeoLT;

    public MeoLyThuyetAdapter(Context context, int layout, ArrayList<Meo_Ly_Thuyet> meoLTList){
            myContext = context;
            myLayout = layout;
            arrayMeoLT = meoLTList;
    }

    @Override
    public int getCount() {
        return arrayMeoLT.size();
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

        TextView txtTenMeo = (TextView) convertView.findViewById(R.id.textViewTenMeoLT);
        txtTenMeo.setText(arrayMeoLT.get(position).TenMeoLT);

        TextView txtNoiDungMeo = (TextView) convertView.findViewById(R.id.textViewNoiDung);
        txtNoiDungMeo.setText(arrayMeoLT.get(position).NoiDungMeoLT);
        return convertView;
    }
}
