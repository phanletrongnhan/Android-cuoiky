package com.example.banglaixe.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.banglaixe.R;

public class FragmentBienBaoChiDan extends Fragment {
    ListView lvBienBaoChiDan;
    String ChiDan[]={"Khách sạn", "Cầu vượt liên thông", "Đường cụt", "Trạm sửa chữa", "Hết khu đông dân cư", "Mũi tên chỉ đường", "Lối đi đường vòng tránh", "Nơi nghỉ mát","Hết đường dành cho ôtô", "Bắt đầu khu đông dân cư"};
    String NDCD[]={"Để chỉ dẫn những nơi có khách sạn phục vụ khách đi đường.", "Đặt biển tại vị trí thích hợp trước khi vào cầu vượt.", "Để chỉ lối rẽ vào đường cụt.", "Để chỉ dẫn những nơi có đặt xưởng chuyên phục vụ sửa chữa ôtô, môtô hỏng trên đường.", "", "","", "Để chỉ dẫn những nơi nghỉ mát.","" +
            "Đến hết đoạn đường dành cho ô tô đi lại phải đặt biển số 404a.", ""};
    int CDIMG[]={R.drawable.khach_san, R.drawable.chi_dan_cau_vuot_lien_thong, R.drawable.duong_cut, R.drawable.tram_sua_chua, R.drawable.het_khu_dan_cu, R.drawable.mui_ten_chi_duong, R.drawable.di_duong_vong, R.drawable.noi_nghi_mat, R.drawable.het_duong, R.drawable.dong_dan_cu};

    private View mRootView;
    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String aChiDan[];
        String aNDCD[];
        int aCDIMG[];
        myAdapter(Context c, String chidan[], String ndcd[], int cdIMG[]) {
            super(c, R.layout.fragment_bien_bao_chi_dan, R.id.textViewBienBaoCD, ChiDan);
            this.context = c;
            this.aChiDan = chidan;
            this.aNDCD = ndcd;
            this.aCDIMG = cdIMG;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.fragment_bien_bao_chi_dan, parent, false);
            ImageView images = row.findViewById(R.id.imageBienBaoChiDan);
            TextView myTitle = row.findViewById(R.id.textViewBienBaoCD);
            TextView myNoiDung = row.findViewById(R.id.textViewNDCD);

            images.setImageResource(CDIMG[position]);
            myTitle.setText(ChiDan[position]);
            myNoiDung.setText(NDCD[position]);

            return row;

        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.header_bienbaochidan, container, false);
        return mRootView;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvBienBaoChiDan = getActivity().findViewById(R.id.lvBienBaoChiDan);
        FragmentBienBaoChiDan.myAdapter adapter = new myAdapter(getContext(), ChiDan, NDCD, CDIMG);
        lvBienBaoChiDan.setAdapter(adapter);

    }
}
