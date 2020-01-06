package com.example.banglaixe.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.banglaixe.Adapter.MeoLyThuyetAdapter;
import com.example.banglaixe.Object.Meo_Ly_Thuyet;
import com.example.banglaixe.R;

import java.util.ArrayList;

public class FragmentMeoThiLyThuyet extends Fragment {

    private ListView lvMeoLyThuyet;
    private ArrayList<Meo_Ly_Thuyet> mangMeoLyThuyet;

    private View mRootView;

    public FragmentMeoThiLyThuyet() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.list_meo_ly_thuyet,container,false);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        lvMeoLyThuyet = (ListView) getView()  .findViewById(R.id.listViewMeoLT);
        mangMeoLyThuyet = new ArrayList<Meo_Ly_Thuyet>();

        mangMeoLyThuyet.add(new Meo_Ly_Thuyet("Khái Niệm và quy tắc","Câu khái niệm \" Phương tiện giao thông cơ giới đường bộ\" chọn \" Kể cả xe máy điện \".\n" +
                "Câu khái nệm \" Phương tiện giao thông thô sơ đường bộ \" chọn \" Kể cả xe đạp máy \".\n" +
                "Câu khái nệm \" Người điểu khiển giao thông \" là \"Cảnh sát giao thông\".\n" +
                "Câu khái nệm \" Phần đường xe chạy \" chọn câu không có chữ \"An toàn giao thông \".\n" +
                "Câu khái nệm \" Làn đường \" chọn câu có chữ \" An toàn giao thông \".\n" +
                "Các câu \" Đỗ xe : không có thời hạn về thời gian và Dừng xe có giới hạn thời gian \" chọn câu số 2.\n" +
                "Về nồng độ cồn, trong máu = 50, trong khí thờ = 0,25 hoặc không có gì trong cả máu và khí thở.\n" +
                "Dừng xe, đỗ xe các lề đường, hè phố không quá 0,25m.\n" +
                "Giữ khoảng cách 5m với đường sắt.\n" +
                "Sử dụng giấy phép lái xe giả cấm 05 năm.\n" +
                "Chọn \" Cơ quan quản lý giao thông  \" đối với các trường hợp xe quá tải, xe quá khổ và xe vận chuyển hàng nguy hiểm.\n" +
                "Chọn \" UBND cấp tỉnh \" đối với trường hợp cấm đi, cấm đổ, cấm dừng, đường ngược chiều.\n" +
                "Loại giấy tờ mang theo : Giấy phép lấy xe phù hợp với loại xe.\n" +
                "Độ tuổi lấy bằng theo hạng ( Mỗi hạng cách nhau 3 buổi ) : 15 : xe dưới 50cm3; 18 : Hạng A,B; 21 : Hạng C; 24 : Hạng D, FC; 27 : Hạng E.\n" +
                "Độ tuổi tối đa của người lái xe ô tô hạng E : Nam 55 tuổi và nữ 50 tuổi.\n" +
                "Không lái xe liên tục trong quá 4 giờ.\n" +
                "Gặp câu hỏi về hạng FE thì chọn câu 1, hạng FC thì chọn câu 2.\n" +
                "Tốc độ giới hạn của xe : Bên ngoài khu dân cư 80km/h < 3,5 tấn, 70km/h > 3,5 tấn.\n" +
                "Tốc độ của xe ô tô trên đường cao tốc, bạn lấy tốc độ ( lớn nhất ) trong câu hỏi đó rồi trừ cho 30 thì sẽ ra đáp án đúng.\n"));


        mangMeoLyThuyet.add(new Meo_Ly_Thuyet("Hệ thống biển báo","Đối với các câu có biển báo hiệu lệnh được đặt trước ngã ba, ngã tư. Chọn caai 1 nếu câu hỏi 1 dòng, câu 3 nếu câu hỏi có 2 dòng.\n" +
                "Biển báo cấm máy kéo thì không cấm ô tô tải và ngược lại.\n" +
                "Biển báo cấm rẽ trái thì cấm quay đầu và biển báo cấm quay đầu thì không cấm rẽ trái.\n"));


        mangMeoLyThuyet.add(new Meo_Ly_Thuyet("Sa hình","Đối với các câu hỏi liên quan đến việc điều khiển của CSGT, CSGT giơ tay thẳng lên thì các loại xe phải dừng lại, đưa 1 hoặc 2 tay giang ngang thì các xe trứớc và đằng sau phải dùng lại\n" +
                "Đường giao nhau có vòng xuyến nhường bên trái, không có vòng xuyến nhường bên phải.\n" +
                "Thấy xuất hiện \" Công an \" thì chọn câu số 3\n" +
                "Xe nào đã vào ngã tư thì xe đó có quyền ưu tiên đi trước cao nhất.\n" +
                "Tiếp đó đến các xe ưu tiên. Trong các xe ưu tiên thì xe cứu hỏa có ưu tiên xe quân sự, xe công an, xe cứu thương.\n" +
                "Tiếp đó nếu cùng là xe ưu tiên hoặc cùng là xe không ưu tiên thì có quyền đi trước ( Xem biển báo hoặc tín hiệu đèn ).\n" +
                "Xe nào không vướng xe khác ở bên phải có quyền đi trước. Thứ tự ưu tiên tiếp theo : xe rẽ phải => xe đi thằng => Xe rẽ trái. \n"));

        MeoLyThuyetAdapter adapter = new MeoLyThuyetAdapter(
                getActivity(),
                R.layout.fragment_meo_thi_ly_thuyet,
                mangMeoLyThuyet
        );
       lvMeoLyThuyet.setAdapter(adapter);


    }
}