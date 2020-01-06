package com.example.banglaixe;

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

public class FragmentBienBaoPhu extends Fragment {
    ListView lvBienBaoPhu;
    String Phu[]={"Hướng rẽ", "Hướng tác dụng của biển", "Hướng tác dụng của biển", "Hướng tác dụng của biển", "Khoảng cách đến đối tượng báo hiệu", "Biểu thị thời gian"};
    String BaoPhu[]={"Biển được sử dụng độc lập để báo trước cho người biết gần đến chỗ rẽ nguy hiểm và để chỉ hướng rẽ.", "Để chỉ đồng thời 2 hướng tác dụng(xuôi và ngược) của biển báo nhắc lại lệnh cấm dừng và cấm đỗ xe.", "" +
            "Đặt bên dưới các biển báo cấm, biển hiệu lệnh để chỉ hướng tác dụng của biển là hướng vuông góc với chiều đi.", "Để chỉ đồng thời 2 hướng tác dụng (trái và phải) của biển chính hoặc được đặt với biển báo nhắc lại lệnh cấm và hiệu lệnh.", "" +
            "Để thông báo khoảng cách thực tế từ vị trí đặt biển đến đối tượng báo hiệu ở phía trước.", "Biểu thị thời gian."};
    int PIMG[]={R.drawable.huong_re, R.drawable.huong_tac_dung, R.drawable.huong_tac_dung_phai, R.drawable.huong_tac_dung_ngang, R.drawable.khoang_cach, R.drawable.bieu_thi_time};
    private View mRootView;

    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String aPhu[];
        String aBaoPhu[];
        int aPIMG[];
        myAdapter(Context c, String phu[], String baophu[], int pIMG[]) {
            super(c, R.layout.fragment_bien_bao_phu, R.id.textViewBienBaoPhu, BaoPhu);
            this.context = c;
            this.aPhu = phu;
            this.aBaoPhu = baophu;
            this.aPIMG = pIMG;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.fragment_bien_bao_phu, parent, false);
            ImageView images = row.findViewById(R.id.imageBienBaoPhu);
            TextView myTitle = row.findViewById(R.id.textViewBienBaoPhu);
            TextView myNoiDung = row.findViewById(R.id.textViewBienBaoPhu);

            images.setImageResource(PIMG[position]);
            myTitle.setText(Phu[position]);
            myNoiDung.setText(BaoPhu[position]);

            return row;

        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_bien_bao_phu, container, false);
        return mRootView;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvBienBaoPhu = getActivity().findViewById(R.id.lvBienBaoCam);
        FragmentBienBaoPhu.myAdapter adapter = new myAdapter(getContext(), Phu, BaoPhu, PIMG);
        lvBienBaoPhu.setAdapter(adapter);

    }
}