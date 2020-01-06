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

public class FragmentBienBaoHieuLenh extends Fragment {
    ListView lvBienBaoHieuLenh;
    String BienBaoo[]={"Ấn còi", "Tốc độ tối thiểu cho phép", "Hết hạn chế tốc độ tối thiểu", "Hướng đi phải theo", "Hướng đi phải theo", "Hướng đi phải theo", "Hướng đi phải theo"};
    String NoiDungg[]={"Biểu thị xe cộ đi đến chỗ cắm biển đó thì phải ấn còi", "Báo tốc độ tối thiểu cho phép các xe cơ giới chạy. Biển có hiệu lực cấm các loại xe cơ giới chạy với tốc độ nhỏ hơn trị số ghi trên biển. Các loại xe do sự chế tạo có tốc độ tối đa không đạt tốc độ tối thiểu đã ghi không được phép đi vào đường này. Trị số ghi trên biển chỉ tốc độ tối thiểu cho phép tính bằng km/h", "" +
            "Báo hết đoạn đường hạn chế tốc độ tối thiểu. Biển có giá trị báo cho người lái xe biết hiệu lực của biển số 306 hết tác dụng, kể từ biển này các loại xe được phép chạy chậm hơn trị số ghi trên biển nhưng không được gây cản trở các xe khác", "" +
            "Để báo cho các loại xe (thô sơ và cơ giới) chỉ được đi thẳng", "Để báo cho các loại xe (thô sơ và cơ giới) chỉ được rẽ phải", "Để báo cho các loại xe (thô sơ và cơ giới) chỉ được rẽ trái", "Để báo cho các loại xe (thô sơ và cơ giới) chỉ được rẽ trái và rẽ phải"};
    int IMG[]={R.drawable.an_coi, R.drawable.toc_do_toi_thieu, R.drawable.het_han_che_toc_do_toi_thieu, R.drawable.huong_di_phai_theo, R.drawable.huong_di_phai_theo_phai, R.drawable.huong_di_phai_theo_trai, R.drawable.huong_di_phai_theo_2ben};
    private View mRootView;

    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String aBienBaoo[];
        String aNoiDungg[];
        int aIMG[];
        myAdapter(Context c, String bienbao[], String noidung[], int imag[]) {
            super(c, R.layout.fragment_bien_bao_hieu_lenh, R.id.textViewBienBaoHieuLenh, BienBaoo);
            this.context = c;
            this.aBienBaoo = bienbao;
            this.aNoiDungg = noidung;
            this.aIMG = imag;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.fragment_bien_bao_hieu_lenh, parent, false);
            ImageView images = row.findViewById(R.id.imageHieuLenh);
            TextView myTitle = row.findViewById(R.id.textViewBienBaoHieuLenh);
            TextView myNoiDung = row.findViewById(R.id.textViewNDHL);

            images.setImageResource(IMG[position]);
            myTitle.setText(BienBaoo[position]);
            myNoiDung.setText(NoiDungg[position]);

            return row;

        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.header_bienbaohieulenh,container,false);
        return mRootView;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvBienBaoHieuLenh = getActivity().findViewById(R.id.lvBienBaoHieuLenh);
        FragmentBienBaoHieuLenh.myAdapter adapter = new myAdapter(getContext(), BienBaoo, NoiDungg, IMG);
        lvBienBaoHieuLenh.setAdapter(adapter);

    }
}
