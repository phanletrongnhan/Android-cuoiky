package com.example.banglaixe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.banglaixe.Adapter.MeoThucHanhAdapter;

import java.util.ArrayList;

public class FragmentMeoThiThucHanh extends Fragment {
    private ListView lvMeoThucHanh;
    private ArrayList<Meo_Thuc_Hanh> mangMeoThucHanh;

    private View mRootView;

    public FragmentMeoThiThucHanh() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.list_meo_thuc_hanh,container,false);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        lvMeoThucHanh = (ListView) getView()  .findViewById(R.id.listViewMeoTH);
        mangMeoThucHanh = new ArrayList<Meo_Thuc_Hanh>();

        mangMeoThucHanh.add(new Meo_Thuc_Hanh("Giới Thiệu","Hiện nay, Trong việc thi bằng lái xe máy thì phần thi thực hành chấm điểm tự động bằng chip. Do máy tự động chấm điểm nên việc thi thực hành tỷ lệ trượt nhiều hơn trước. Qua quá trình tổ chức thi sát hạch qua rất nhiều học viên đúc kết ra một số mẹo cần chuẩn bị trước để thi đảm bảo đỗ 100%\n" +
                "\n" +
                "1. Tập trước vòng số 8 ở nhà.\n" +
                "Phần thi thực hành trượt nhiều nhất là ở phần thi vòng số 8. Do đó, việc bạn đã biết đi xe máy thành thạo nhưng chưa tập qua vòng số 8  thì cũng rất dễ bị trượt. Bạn nên tập trung qua vòng số 8 càng nhiều lần càng tốt. Ít nhất là lúc đi xe vào trong vòng số 8 không còn cảm thấy loạng choạng.\n" +
                "\n" +
                "2. Hôm thi lên sân thi thật sớm.\n" +
                "Tại sao chúng tôi lại khuyên bạn như vậy ? Bởi vì xe bạn thì bạn quen với nó, đi rất ngon lành. Nhưng xe của sân thi thì khác rất nhiều đấy, nếu bạn không đến sớm để làm quen với nó thì cũng rất dễ trượt. Hơn nữa, buổi thi thường sẽ có rất đông người. Nếu bạn đến sớm thì không phải chờ lâu mới được tập xe. Còn nếu đến muộn thì khả năng cao phải xếp hàng dài mới đến lượt mình.\n" +
                "\n" +
                "3. Cách đi để không bị chạm vạch\n" +
                "Đi xe vào từ mép ngoài bên trái, bởi vì như thế thì bánh sau mới không bị đè lên vạch. Nếu bạn đi vào từ mép ngoài bên phải thì bánh trước vào rất ngon lành, nhưng rất tiếc bánh sau sẽ bị đè lên vạch ngay. Tương tự lúc ra khỏi vòng số 8 cũng như vậy. Bạn phải cho xe ra từ mép ngoài bên trái, nếu không bánh sau của xe cũng sẽ đè lên vạch.\n" +
                "\n" +
                "Lưu Ý : Lúc thi thực hành bạn nên để xe ở số 3 mà đi. Bởi vì số 4 thì có thể hơi yếu, nhưng số 1,2 thì sẽ bị giật mạnh. Phần đường gồ ghề bạn nên để số 3 đi và nên đi chậm chậm vừa phải nếu không muốn bay luôn cả người và xe ra ngoài.\n"));

        mangMeoThucHanh.add(new Meo_Thuc_Hanh("Bài 1 : Chạy Theo Vòng Số 8","Phần 1 : Chạy theo vòng số 8\n" +
                "\n" +
                " - Khi nghe gọi tên vào thi thực hành bài thi sát hạch lái xe mô tô thí sinh nhận xe, đội mũ bảo hiểm, gạt chống xe và nổ máy đưa xe vào vị trí xuất phát.\n" +
                "\n" +
                " - Trong phần thi số 1 thí sonh phải nhớ nguyên tắc vào 8 ra 3, phải chạy đủ vòng. Nên chạy với tốc độ vừa phải trong suốt lộ trình.\n" +
                "\n" +
                " - Khi nghe hiệu lệnh của người chấm thi thì thí sinh bất đầu phần thi số 1 của phần thi thực hành thi sát hạch lái xe mô tô.\n" +
                "\n" +
                " - Gài số vào hình, xuất phát rẽ phải đi 1 vòng số 8 theo mũi tên đỏ sau đó vòng ra cửa số 2 theo hướng mũi tên xanh.\n" +
                "\n" +
                " => Lưu Ý : Trong phần này thì thí sinh nên để số 2 đi luôn cho nóng máy. Khi chạy sa hình số 8, thí sinh mêm hạn nhẹ tay ga xuống. Tuy nhiên tốc độ không nên quá chậm, nếu nhanh thì thí sinh có thể ra thẳng từ từ để phần bánh trước của xe mình bám vào vành ngoài của vòng số 8. Đây là phần thi khó nhất của bài thi thực hành sát hạch lái xe mô tô và giám khảo cũng thương quan sát kỹ phần thi này nên các bạn cần lưu ý.\n"));

        mangMeoThucHanh.add(new Meo_Thuc_Hanh("Bài 2 : Chạy Vào Đường Hẹp"," Trong Phần này Đường đi khá hẹp nên các bạn thí sinh cần lưu ý chỉ nên đi với tốc độ vừa phải, và đi giữa đường để tránh bị chạm vạch."));

        mangMeoThucHanh.add(new Meo_Thuc_Hanh("Bài 3 : Chạy Đường Quanh Co"," Trong phần 3 của bài thi thực hành thi sát hạch lái xe mô tô, thí sinh nên nhảy ga đều đặn để xe chạy nhịp nhành. Phần thi này đòi nhỏi học viên cần có kĩ năng đi vòng cua."));

        mangMeoThucHanh.add(new Meo_Thuc_Hanh("Bài 4 : Chạy Đường Quanh Co"," Đây là phần thi thực hành cuối cùng. Các thí sinh phải giữ vững tay lái của mình trsanh tình trạng mất lái, không nên đi với tốc độ quá chậm vì sẽ dễ ngã ảnh hưởng đến bài thi."));

        MeoThucHanhAdapter adapter = new MeoThucHanhAdapter(
                getActivity(),
                R.layout.fragment_meo_thi_thuc_hanh,
                mangMeoThucHanh
        );
        lvMeoThucHanh.setAdapter(adapter);
}}
