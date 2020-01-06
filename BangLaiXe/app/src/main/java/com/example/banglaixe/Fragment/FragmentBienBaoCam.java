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


public class FragmentBienBaoCam extends Fragment {
    ListView lvBienBaoCam;
    String tittle[]={"Cấm máy kéo", "Cự ly tối thiểu giữa hai xe","Cấm xe người kéo, đẩy","Cấm ôtô khách và ôtô tải","Hạn chế chiều dài ôtô", "Cấm ôtô rẽ trái", "Đường cấm", "Cấm đi xe đạp", "Cấm đi thẳng và rẽ trái", "Hết hạn chế tốc độ tối đa", "Tốc độ tối đa cho phép", "Cấm xe đạp thồ", "Cấm bóp còi","Cấm vượt"};
    String noidung[]={"Để báo đường cấm tất cả các loại máy kéo, kể cả máy kéo bánh hơi và bánh xích đi qua", "Để báo xe ôtô phải đi cách nhau một khoảng tối thiểu. Số ghi trên biển cho biết khoảng cách tối thiểu tnh bằng mét. Biển có hiệu lực cấm các xe ôtô không được đi cách nhau kể cả các xe được ưu tiên theo luật lệ nhà nước quy định một cự ly nhỏ hơn số ghi trên biển báo",
            "Để báo đường cấm xe người kéo, đẩy đi qua. Biển không có giá trị cấm những xe nôi của trẻ em và phương tiện chuyên dùng để đi lại của người tàn tật","" +
            "Để báo đường cấm ôtô chở hành khách và các loại ôtô tải có trọng lượng lớn nhất cho phép trên 3,5 Tấn kể cả các loại máy kéo và xe máy thi công chuyên dùng đi qua trừ các xe được ưu tiên theo luật lệ nhà nước quy định",
            "Để báo đường cấm các loại xe (cơ giới và thô sơ) kể cả các xe được ưu tiên theo luật lệ nhà nước quy định, có độ dài toàn bộ kể cả xe và hàng lớn hơn trị số ghi trên biển đi",
            "Đường cấm tất cả các loại xe cơ giới môtô 3 bánh có thùng xe rẽ trái, trừ môtô 2 bánh, xe gắn máy và các xe được ưu tiên theo luật lệ nhà nước",
            "Đường cấm tất cả các loại phương tiện (cơ giới và thô sơ) đi lại cả hai hướng, trừ các xe được ưu tiên theo luật lệ nhà nước quy định",
            "Để báo đường cấm xe đạp đi qua", "Biểu thị ở ngã tư, ngã năm đường phía trước cấm tất cả các loại xe đi thẳng và rẽ trái", "Biển báo hết đoạn đường hạn chế tốc độ tối đa. Kể từ biển này, các xe được phép chạy với tốc độ tối đa đã quy định trong Luật Giao thông đường bộ.",
            "Cấm tất cả các loại xe cơ giới chạy với tốc độ tối đa vượt quá trị số ghi trên biển, trừ các xe được ưu tiên theo luật lệ Nhà nước", "Để báo đường cấm xe đạp thồ đi qua. Biển này không cấm người dắt loại xe này", "Cấm các loại xe cơ giới sử dụng còi", "Cấm các loại xe cơ giới vượt nhau kể cả các xe được ưu tiên theo luật lệ Nhà nước quy định. Được phép vượt xe mô tô 2 bánh, xe gắn máy"};
    int image[]={R.drawable.cam_may_keo,R.drawable.cu_ly_toi_thieu,R.drawable.cam_keo_day,R.drawable.cam_otokhach_tai,R.drawable.han_che_chieu_dai_oto,R.drawable.cam_oto_re_trai,R.drawable.duong_cam,R.drawable.cam_xe_dap,R.drawable.camdithang_retrai,R.drawable.het_han_che_toc_do_toi_da,R.drawable.toc_do_toi_da_cho_phep, R.drawable.cam_xe_dap_tho, R.drawable.cam_bop_coi, R.drawable.cam_vuot};
    private View mRootView;
    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String atittle[];
        String anoidung[];
        int aimage[];
        myAdapter(Context c, String title[], String noiDung[], int Image[]) {
            super(c, R.layout.fragment_bien_bao_cam, R.id.textViewLoaiBienBao, tittle);
            this.context = c;
            this.atittle = title;
            this.anoidung = noiDung;
            this.aimage = image;


        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.fragment_bien_bao_cam, parent, false);
            ImageView images = row.findViewById(R.id.imageView);
            TextView myTitle = row.findViewById(R.id.textViewLoaiBienBao);
            TextView myNoiDung = row.findViewById(R.id.textViewNoiDung);

            images.setImageResource(image[position]);
            myTitle.setText(tittle[position]);
            myNoiDung.setText(noidung[position]);

            return row;

        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mRootView = inflater.inflate(R.layout.header_bienbaocam, container, false);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvBienBaoCam = getActivity().findViewById(R.id.lvBienBaoCam);
        FragmentBienBaoCam.myAdapter adapter = new myAdapter(getContext(), tittle, noidung, image);
        lvBienBaoCam.setAdapter(adapter);

    }
}
