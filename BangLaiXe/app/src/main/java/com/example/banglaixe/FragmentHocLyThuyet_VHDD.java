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

public class FragmentHocLyThuyet_VHDD extends Fragment {
    private ListView lvHocLyThuyetVH;
    private ArrayList<Hoc_Ly_Thuyet_VHDD> mangHocLyThuyetVH;

    private View mRootView;

    public FragmentHocLyThuyet_VHDD() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.list_hoc_lt_vhdd,container,false);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        lvHocLyThuyetVH = (ListView) getView().findViewById(R.id.listViewHocVH);
        mangHocLyThuyetVH = new ArrayList<Hoc_Ly_Thuyet_VHDD>();

        mangHocLyThuyetVH.add(new Hoc_Ly_Thuyet_VHDD("Câu 1: Khái niệm về văn hóa giao thông được hiểu như thế nào là đúng?\n","\"1- Là sự hiểu biết và chấp hành nghiêm chỉnh pháp luật về giao thông, là ý thức trách nhiệm với cộng\n" +
                "đồng khi tham gia giao thông.\n" +
                "2- Là ứng xử văn hóa có tình yêu thương con người trong các tình huống không may xảy ra khi thamgia\n" +
                "giao thông.\"\n" +
                "Đáp án 1,2.\n"));
        mangHocLyThuyetVH.add(new Hoc_Ly_Thuyet_VHDD("Câu 2 : Người lái xe cố tình vi phạm Luật giao thông đường bộ, không phân biệt làn đường, vạch phân làn,\n" +
                "phóng nhanh, vượt ẩu, vượt đèn đỏ, đi vào đường cấm, đường một chiều được coi là hành vi nào\n" +
                "trong các hành vi sau đây?","\"1- Là bình thường.\n" +
                "2- Là thiếu văn hóa giao thông.\n" +
                "3- Là có văn hóa giao thông\"\n" +
                "Đáp án : 2.\n"));
        mangHocLyThuyetVH.add(new Hoc_Ly_Thuyet_VHDD("Câu 3: Trong các hành vi dưới đây, người lái xe mô tô có văn hóa giao thông phải ứng xử như thế nào?\n","\"1- Điều khiển xe đi bên phải chiều đi của mình.\n" +
                "2- Điều khiển xe đi trên phần đường, làn đường có ít phương tiện tham gia giao thông.\n" +
                "3- Đi đúng phần đường, làn đường quy định; đội mũ bảo hiểm đúng quy cách.\n" +
                "4- Đội mũ bảo hiểm ở nơi có biển báo bắt buộc đội mũ bảo hiểm\"\n" +
                "Đáp án: 2,3\n"));
        mangHocLyThuyetVH.add(new Hoc_Ly_Thuyet_VHDD("Câu 4: Người có văn hóa giao thông, khi điều khiển xe cơ giới tham gia giao thông đường bộ phải đảm bảo các điều kiện gì?\n","\"1- Có giấy phép lái xe phù hợp với loại xe được phép điều khiển, xe cơ giới đảm bảo các quy định về chất\n" +
                "lượng, an toàn kỹ thuật và bảo vệ môi trường.\n" +
                "2- Có giấy chứng nhận trách nhiệm bảo hiểm dân sự của chủ xe cơ giới còn hiệu lực, nộp phí sử dụng\n" +
                "đường bộ theo quy định\"\n" +
                "Đáp án: 1,2 \n"));
        mangHocLyThuyetVH.add(new Hoc_Ly_Thuyet_VHDD("Câu 5: Người có văn hóa giao thông, khi điều khiển xe cơ giới tham gia giao thông đường bộ phải đảm bảo các điều kiện gì?\n","\"1- Có giấy phép lái xe phù hợp với loại xe được phép điều khiển, xe cơ giới đảm bảo các quy định về chất\n" +
                "lượng, an toàn kỹ thuật và bảo vệ môi trường.\n" +
                "2- Có giấy chứng nhận trách nhiệm bảo hiểm dân sự của chủ xe cơ giới còn hiệu lực, nộp phí sử dụng\n" +
                "đường bộ theo quy định.\"\n" +
                "Đáp án 1,2.\n"));


        HocLyThuyetVH_Adapter adapter = new HocLyThuyetVH_Adapter(
                getActivity(),
                R.layout.fragment_ly_thuyet_van_hoa_dao_duc,
                mangHocLyThuyetVH
        );
        lvHocLyThuyetVH.setAdapter(adapter);
}}
