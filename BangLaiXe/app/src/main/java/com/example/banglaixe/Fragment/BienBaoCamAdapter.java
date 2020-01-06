package com.example.banglaixe.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.banglaixe.R;

import java.util.ArrayList;
import java.util.List;

public class BienBaoCamAdapter extends BaseAdapter {
    private Context myContext;
    private int myLayout;
    private List<BienBaoCam> arrayBienBaoCam;
    private Object LayoutInflater;

    public BienBaoCamAdapter(Context context, int layout, ArrayList<BienBaoCam> BienBaoCamList){
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

    public class ViewHolder {
        TextView txtLoaiBienBao, txtNoiDungBienBao;
        ImageView imgHinh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        if(convertView == null)
        {
            holder = new ViewHolder();
            LayoutInflater = (LayoutInflater) myContext.getSystemService(myContext.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(myLayout, null);
            holder.txtLoaiBienBao = (TextView)convertView.findViewById(R.id.textViewLoaiBienBao);
            holder.txtNoiDungBienBao = (TextView) convertView.findViewById(R.id.textViewNoiDung);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        BienBaoCam bienBaoCam = arrayBienBaoCam.get(position);
        holder.txtLoaiBienBao.setText(bienBaoCam.getLoaiBien());
        holder.txtNoiDungBienBao.setText(bienBaoCam.getNoiDung());
        byte[] hinhanh = bienBaoCam.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(hinhanh, 0,hinhanh.length);
        holder.imgHinh.setImageBitmap(bitmap);

        return convertView;
    }
}
