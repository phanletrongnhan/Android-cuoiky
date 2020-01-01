package com.example.banglaixe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.banglaixe.Fragment.FragmentBienBaoCam;
import com.example.banglaixe.R;

import java.util.List;

public class BienBaoCamAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<FragmentBienBaoCam> listBienBao;

    public BienBaoCamAdapter(Context context, int layout, List<FragmentBienBaoCam> listBienBao) {
        this.context = context;
        this.layout = layout;
        this.listBienBao = listBienBao;
    }

    @Override
    public int getCount() {
        return listBienBao.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder {
        TextView txtLoaiBienBao, txtNoiDung;
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.txtLoaiBienBao = (TextView) convertView.findViewById(R.id.textviewLoaiBienBao);
            holder.txtNoiDung = (TextView) convertView.findViewById(R.id.textViewNoiDung);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageHinh);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        FragmentBienBaoCam BienBaoCam = listBienBao.get(position);

        holder.txtLoaiBienBao.setText(BienBaoCam.getLoaiBienBao());
        holder.txtNoiDung.setText(BienBaoCam.getNoiDung());
        holder.imgHinh.setImageDrawable(BienBaoCam.getImage());
        return convertView;
    }
}
