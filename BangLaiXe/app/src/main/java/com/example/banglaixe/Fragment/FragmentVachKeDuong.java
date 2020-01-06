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

public class FragmentVachKeDuong extends Fragment {
    ListView lvVachKeDuong;
    String VachKe[]={"Vạch nằm đứng 1", "Vạch nằm đứng 2", "Vạch nằm đứng 4", "Vạch nằm đứng 7", "Vạch nằm ngang 2", "Vạch nằm ngang 16.1"};
    String NDVK[]={"Xác định các bộ phận thẳng đứng của các công trình giao thông như trụ cầu, cầu vượt đường,...để chỉ dẫn những chỗ nguy hiểm đối với phương tiện giao thông đi qua.","" +
            "Là vạch trắng đen xen kẽ thẳng đứng, xác định cạnh dưới cùng của cầu và cầu vượt đường.", "Là vạch xiên góc màu đen tạo với mặt phẳng ngang góc 30 độ rộng 0,15m dùng để kẻ trên các cột tín hiệu, cột rào chắn.","" +
            "Vạch liền, màu trắng, rộng 20cm, dùng để xác định mép phần xe chạy trên các trục đường. Xe chạy được phép cắt ngang hoặc đè lên vạch khi cần thiết.","" +
            "Ngựa vằn màu trắng, xác định đảo phân chia dòng phương tiện ngược chiều nhau."};
    int KIMG[]={};

    private View mRootView;

    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String aVachKe[];
        String aNDVK[];
        int aKIMG[];
        myAdapter(Context c, String vachke[], String ndvk[], int kimg[]) {
            super(c, R.layout.fragment_vach_ke_duong, R.id.textViewVKD, VachKe);
            this.context = c;
            this.aVachKe = vachke;
            this.aNDVK = ndvk;
            this.aKIMG = kimg;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.fragment_vach_ke_duong, parent, false);
            ImageView images = row.findViewById(R.id.imageVachKe);
            TextView myTitle = row.findViewById(R.id.textViewVKD);
            TextView myNoiDung = row.findViewById(R.id.textViewNDVK);

            images.setImageResource(KIMG[position]);
            myTitle.setText(VachKe[position]);
            myNoiDung.setText(NDVK[position]);

            return row;

        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_vach_ke_duong, container, false);
        return mRootView;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvVachKeDuong = getActivity().findViewById(R.id.lvBienBaoCam);
        FragmentVachKeDuong.myAdapter adapter = new myAdapter(getContext(), VachKe, NDVK, KIMG);
        lvVachKeDuong.setAdapter(adapter);
    }
}