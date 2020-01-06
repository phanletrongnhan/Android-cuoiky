package com.example.banglaixe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentHocLyThuyet_BB extends Fragment {
    private ListView lvHocLTBB;
    private ArrayList<Hoc_Ly_Thuyet_Bien_Bao> mangHocLTBB;

    private View mRootView;

    public FragmentHocLyThuyet_BB() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.list_hoc_lt_bb,container,false);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lvHocLTBB = (ListView) getView().findViewById(R.id.listViewHocBB);
        mangHocLTBB = new ArrayList<Hoc_Ly_Thuyet_Bien_Bao>();

        mangHocLTBB.add(new Hoc_Ly_Thuyet_Bien_Bao("Câu 1: Biển nào cấm người đi bộ?\n","\"1- Biển 1.\n" +
                "2- Biển 1 và 3.\n" +
                "3- Biển 2.\n" +
                "4- Biển 2 và 3.\"\n" +
                "Đáp án 3.\n",R.drawable.bb1));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 2: Gặp biển nào người lái xe phải nhường đường cho người đi bộ?\n","\"1- Biển 1.\n" +
                "2- Biển 3.\n" +
                "3- Biển 2.\n" +
                "4- Biển 1 và 3.\"\n" +
                "Đáp án 3.\n",R.drawable.bb2)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 3: Biển nào chỉ đường dành cho người đi bộ, các loại xe không được đi vào khi gặp biển này?\n","\"1- Biển 1.\n" +
                "2- Biển 1 và 3.\n" +
                "3- Biển 3.\n" +
                "4- Cả ba biển\"\n" +
                "Đáp án 3.\n",R.drawable.bb3)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 4: Biển nào báo hiệu sắp đến chỗ giao nhau nguy hiểm?\n","\"1- Biển 1 và 2.\n" +
                "2- Biển 2 và 3.\n" +
                "3- Biển 1.\n" +
                "4- Cả ba biển\"\n" +
                "Đáp án 3.\n",R.drawable.bb4)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 5: Biển nào báo hiệu sắp đến chỗ giao nhau với đường sắt có rào chắn?\n","\"1- Biển 1.\n" +
                "2- Biển 2 và 3.\n" +
                "3- Biển 3.\"\n" +
                "Đáp án 3.\n",R.drawable.bb5)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 6: Biển nào báo hiệu giao nhau có tín hiệu đèn?\n","\"1- Biển 2.\n" +
                "2- Biển 1.\n" +
                "3- Biển 3.\n" +
                "4- Cả ba biển.\"\n" +
                "Đáp án 1.\n",R.drawable.bb6)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 7: Biển nào báo hiệu nguy hiểm giao nhau với đường sắt?\n","\"1- Biển 1 và 3.\n" +
                "2- Biển 1 và 2.\n" +
                "3- Biển 2 và 3.\n" +
                "4- Cả ba biển\"\n" +
                "Đáp án 1.\n",R.drawable.bb7)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 8: Biển nào báo hiệu đường sắt giao nhau với đường bộ không có rào chắn?\n","\"1- Biển 1 và 2.\n" +
                "2- Biển 2 và 3.\n" +
                "3- Biển 1 và 3.\n" +
                "4- Cả ba biển\"\n" +
                "Đáp án 2.\n",R.drawable.bb8)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 9: Biển nào báo hiệu “Hết đoạn đường ưu tiên”?\n","\"1- Biển 3.\n" +
                "2- Biển 1.\n" +
                "3- Biển 2.\"\n" +
                "Đáp án 1.\n",R.drawable.bb9)));
        mangHocLTBB.add((new Hoc_Ly_Thuyet_Bien_Bao("Câu 10: Biển nào báo hiệu, chỉ dẫn xe đi trên đường này được quyền ưu tiên qua nơi giao nhau?\n","\"1- Biển 1 và 2.\n" +
                "2- Biển 1 và 3.\n" +
                "3- Cả ba biển.\n" +
                "4- Biển 2 và 3.\"\n" +
                "Đáp án 2.\n",R.drawable.bb10)));

        HocLyThuyetBB_Adapter adapter = new HocLyThuyetBB_Adapter(
                getActivity(),
                R.layout.fragment_hoc_lt_bb,
                mangHocLTBB
        );
        lvHocLTBB.setAdapter(adapter);
}}
