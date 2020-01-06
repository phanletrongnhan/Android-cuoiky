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

public class FragmentBienBaoNguyHiem extends Fragment {
    ListView lvBienBaoNguyHiem;
    String BienBao[]={"Cầu tạm","Đi chậm", "Đường cao tốc phía trước", "Đường giao nhau", "Đường hầm", "Giao nhau với đường hai chiều", "Giao nhau với đường sắt không có rào chắn", "Giao nhau với đường ưu tiên", "Đường hẹp về phía trái", "Thú rừng băng qua đường", "Trẻ em"};
    String NoiDung[]={"Để báo trước sắp đến cầu tạm là loại cầu được làm để sử dụng tạm thời cho xe cộ qua lại", "Dùng để nhắc lái xe giảm tốc độ đi chậm. Biển đặt ở vị trí thích đáng trước khi đến đoạn đường yêu cầu đi chậm.",
            "Biển này nhằm để báo cho các phương tiện đi trên đường biết có \" Đường cao tốc phía trước \" ", "Báo trước sắp đến nơi giao nhau của các tuyến đường cùng cấp, (không có đường nào ưu tiên) trên cùng một mặt phẳng",
            "Dùng để nhắc lái xe chú ý đi chậm lại, biển đặt ở nơi thích hợp mà đường sắp sửa đi vào đường hầm chạy hai chiều, mà chiếu sáng lại không tốt", "Trên đường một chiều, biển này để báo trước sắp đến chỗ giao nhau với đường hai chiều",
            "Báo trước sắp đến chỗ giao nhau giữa đường bộ và đường sắt không có rào chắn, không có người điều khiển giao thông", "Trên đường không ưu tiên, biển này để báo trước sắp đến nơi giao nhau với đường ưu tiên.", "Báo trước sắp đến một đoạn đường bị hẹp đột ngột về phía trái.",
            "Để báo trước gần tới đoạn đường thường có thú rừng qua đường như đường đi qua khu vực rừng cây hay khu cấm săn bắn", "Báo trước là gần đến đoạn đường thường có trẻ em đi ngang qua hoặc tụ tập trên đường như ở vườn trẻ, trường học, câu lạc bộ đi qua"};
    int IMAGE[]={R.drawable.cau_tam, R.drawable.di_cham, R.drawable.duong_cao_toc, R.drawable.duong_giau_nhau, R.drawable.duong_ham, R.drawable.giao_duong_hai_chieu, R.drawable.giao_nhau_voi_duong_sat, R.drawable.giao_nhau_voi_duong_uu_tien, R.drawable.hep_phia_trai, R.drawable.thu_rung, R.drawable.tre_em};
    private View mRootView;

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String aBienBao[];
        String aNoiDung[];
        int aIMAGE[];
        MyAdapter(Context c, String bienbao[], String noidung[], int img[]) {
            super(c, R.layout.fragment_bien_bao_nguy_hiem, R.id.textViewBienBaoNguyHiem, BienBao);
            this.context = c;
            this.aBienBao = bienbao;
            this.aNoiDung = noidung;
            this.aIMAGE = img;


        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.fragment_bien_bao_nguy_hiem, parent, false);
            ImageView images = row.findViewById(R.id.imageNguyHiem);
            TextView myTitle = row.findViewById(R.id.textViewBienBaoNguyHiem);
            TextView myNoiDung = row.findViewById(R.id.textViewNDNH);

            images.setImageResource(IMAGE[position]);
            myTitle.setText(BienBao[position]);
            myNoiDung.setText(NoiDung[position]);

            return row;

        }


    }   @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.header_bienbaonguyhiem, container, false);
        return mRootView;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvBienBaoNguyHiem = getActivity().findViewById(R.id.lvBienBaoNguyHiem);
        FragmentBienBaoNguyHiem.MyAdapter adapter = new MyAdapter(getContext(), BienBao, NoiDung, IMAGE);
        lvBienBaoNguyHiem.setAdapter(adapter);

    }
}