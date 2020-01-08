package com.example.banglaixe.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.banglaixe.Adapter.HocLyThuyetBB_Adapter;
import com.example.banglaixe.Object.Hoc_Ly_Thuyet_Bien_Bao;
import com.example.banglaixe.R;

import java.util.ArrayList;

public class Activity_HocLyThuyet_BB extends AppCompatActivity {

    private ListView lvHocLTBB;
    private ArrayList<Hoc_Ly_Thuyet_Bien_Bao> mangHocLTBB;

    private View mRootView;

    public Activity_HocLyThuyet_BB() {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_hoc_lt_bb);

        lvHocLTBB = findViewById(R.id.listViewHocBB);
        mangHocLTBB = new ArrayList<>();

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
                this,
                R.layout.fragment_hoc_lt_bb,
                mangHocLTBB
        );
        lvHocLTBB.setAdapter(adapter);
    }
}
