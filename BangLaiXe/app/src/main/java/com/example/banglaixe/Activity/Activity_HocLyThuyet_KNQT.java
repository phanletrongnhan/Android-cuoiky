package com.example.banglaixe.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.banglaixe.Adapter.HocLyThuyetKNQT_Adapter;
import com.example.banglaixe.Object.Hoc_LT_KNQT;
import com.example.banglaixe.R;

import java.util.ArrayList;

public class Activity_HocLyThuyet_KNQT extends AppCompatActivity {


    private View mRootView;

    public Activity_HocLyThuyet_KNQT() {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_hoc_lt_knqt);


        ListView lvHocLyThuyet= findViewById(R.id.listViewHocLT);
        ArrayList<Hoc_LT_KNQT> mangHocLyThuyet = new ArrayList<>();

        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 1 : Khái niệm “phần đường xe chạy” được hiểu như thế nào là đúng?", "\"1- Là phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại.\n" +
                "2- Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, dải đất dọc hai bên đường để\n" +
                "đảm bảo an toàn giao thông.\n" +
                "3- Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, các công trình, thiết bị phụ\n" +
                "trợ khác và dải đất dọc hai bên đường để đảm bảo an toàn giao thông.\"\n" +
                "Đáp án 1\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 2 : “Vạch kẻ đường” được hiểu như thế nào là đúng?", "\"1- Vạch kẻ đường là vạch chỉ sự phân chia làn đường, vị trí hoặc hướng đi, vị trí dừng lại.\n" +
                "2- Vạch kẻ đường là vạch chỉ sự phân biệt trí dừng, đỗ trên đường.\n" +
                "3- Tất cả các ý nêu trên.\"\n" +
                "Đáp án 1\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 3 : Khái niệm “làn đường” được hiểu như thế nào là đúng?\n", "\"1- Là phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại.\n" +
                "2- Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, dải đất dọc hai bên đường để\n" +
                "đảm bảo an toàn giao thông.\n" +
                "3- Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, các công trình, thiết bị phụ\n" +
                "trợ khác và dải đất dọc hai bên đường để đảm bảo an toàn giao thông.\"\n" +
                "Đáp án 2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 4 : Khái niệm “đường phố” được hiểu như thế nào là đúng?\n", "\"1- Đường phố là đường đô thị, gồm lòng đường và hè phố.\n" +
                "2- Đường phố là đường bộ ngoài đô thị có lòng đường đủ rộng cho các phương tiện giao thông qua lại\n" +
                "3- Cả 02 ý nêu trên.\"\n" +
                "Đáp án 1\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 5 : Khái niệm “đường bộ” được hiểu như thế nào là đúng?\n", "\"Đường bộ gồm:\n" +
                "1- Đường bộ, cầu đường bộ.\n" +
                "2- Hầm đường bộ, bến phà đường bộ.\n" +
                "3- Đường, cầu đường bộ, hầm đường bộ, bến phà đường bộ và các công trình phụ trợ khác.\"\n" +
                "Đáp án 1,2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 6 : Khái niệm “dải phân cách” được hiểu như thế nào là đúng?\n", "\"1- Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia\n" +
                "phần đường của xe cơ giới và xe thô sơ.\n" +
                "2- Là bộ phận của đường để xác định ranh giới của đất dành cho người đi bộ theo chiều ngang của đường.\n" +
                "3- Là bộ phận của đường để ngăn cách không cho các loại xe vào những nơi không được phép.\"\n" +
                "Đáp án 1\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 7 : Dải phân cách trên đường bộ có những loại nào?\n", "\"1- Loại cố định.\n" +
                "2- Loại di động.\"\n" +
                "Đáp án 1,2.\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 8 : Khái niệm “đường ưu tiên” được hiểu như thế nào là đúng?\n", "\"1- Đường ưu tiên là đường mà trên đó phương tiện tham gia giao thông đường bộ phải nhường đường\n" +
                "cho các phương tiện đến từ hướng khác khi qua nơi đường giao nhau, có thể được cắm biển báo hiệu\n" +
                "đường ưu tiên.\n" +
                "2- Đường ưu tiên là đường mà trên đó phương tiện tham gia giao thông đường bộ được các phương tiện\n" +
                "đến từ hướng khác nhường đường khi qua nơi đường giao nhau, được cắm biển báo hiệu đường ưu\n" +
                "tiên.\n" +
                "3- Đường ưu tiên là đường chỉ dành cho một số loại phương tiện tham gia giao thông, được cắm biển báo\n" +
                "hiệu đường ưu tiên.\"\n" +
                "Đáp án 2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 9: “Phương tiện giao thông đường bộ” gồm những loại nào?\n", "\"1- Phương tiện giao thông cơ giới đường bộ, phương tiện giao thông thô sơ đường bộ.\n" +
                "2- Phương tiện giao thông thô sơ đường bộ, phương tiện giao thông cơ giới đường bộ và xe máy chuyên\n" +
                "dùng.\n" +
                "3- Cả hai ý nêu trên\"\n" +
                "Đáp án 2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 10: Khái niệm “phương tiện giao thông cơ giới đường bộ” được hiểu như thế nào là đúng?\n", "\"1- Gồm xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, xe cơ giới dành cho người\n" +
                "khuyết tật và xe máy chuyên dùng.\n" +
                "2- Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo, xe mô tô hai bánh,\n" +
                "xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự\"\n" +
                "Đáp án 1\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("\"Câu 11 : Việc sản xuất, mua bán, sử dụng biển xe cơ giới, xe máy chuyên dùng được quy định như thế nào\n" +
                "trong Luật giao thông đường bộ ?\"\n", "\"1- Nghiêm cấm sản xuất, được phép sử dụng.\n" +
                "2- Nghiêm cấm mua bán,cho phép sử dụng.\n" +
                "3- Nghiêm cấm sản xuất, mua bán, sử dụng trái phép.\"\n" +
                "Đáp án 3\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 12: Người lái xe không được vượt xe khác khi gặp trường hợp nào ghi ở dưới đây?\n", "\"1- Trên cầu hẹp có một làn xe, nơi đường giao nhau, đường bộ giao nhau cùng mức với đường sắt.\n" +
                "2- Điều kiện thời tiết hoặc đường không đảm bảo an toàn cho việc vượt, xe ưu tiên đang phát tín hiệu ưu\n" +
                "tiên làm nhiệm vụ.\"\n" +
                "Đáp án 1,2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("\"Câu 13: Người điều khiển xe mô tô hai bánh, ba bánh, xe gắn máy có được phép sử dụng xe để kéo, đẩy các\n" +
                "xe khác, vật khác khi tham gia giao thông không?\"\n", "\"1- Được phép.\n" +
                "2- Tùy trường hợp.\n" +
                "3- Không được phép.\"\n" +
                "Đáp án 12,3\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("\"Câu 14: Người ngồi trên xe mô tô hai bánh, ba bánh, xe gắn máy khi tham gia giao thông không được thực\n" +
                "hiện những hành vi nào sau đây?\"\n", "\"1- Đội mũ bảo hiểm và cài quai đúng cách.\n" +
                "2- Sử dụng ô; bấm, kéo hoặc đẩy các phương tiện khác.\n" +
                "3- Đứng trên yên, giá đèo hàng hoặc ngồi trên tay lái, các hành vi khác gây mất trật tự an toàn giao thông\"\n" +
                "Đáp án 1,2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("\"Câu 15: Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được\n" +
                "mang, vác vật cồng kềnh hay không?\"\n", "\"1- Được mang, vác tùy trường hợp cụ thể.\n" +
                "2- Không được mang, vác.\n" +
                "3- Được mang, vác nhưng phải đảm bảo an toàn.\"\n" +
                "Đáp án 2\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 16: Khi điều khiển xe mô tô hai bánh, mô tô ba bánh, xe gắn máy những hành vi nào không được phép?\n", ""));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("", "\"1- Buông cả hai tay hoặc đi xe bằng một bánh đối với xe hai bánh, bằng hai bánh đối với xe ba bánh, chạy\n" +
                "quá tốc độ quy định.\n" +
                "2- Sử dụng xe để kéo, đẩy xe khác, vật khác và chở vật cồng kềnh, để chân chống quẹt xuống đất và cá\n" +
                "hành vi khác gây mất trật tự an toàn giao thông.\n" +
                "3- Chạy đúng tốc độ quy định và chấp hành đúng quy tắc giao thông đường bộ.\"\n" +
                "Đáp án 3\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 17: Bảo đảm trật tự an toàn giao thông đường bộ là trách nhiệm của ai?\n", "\"1- Là trách nhiệm của ngành giao thông vận tải và ngành công an.\n" +
                "2- Là trách nhiệm của cơ quan, tổ chức, cá nhân.\n" +
                "3- Là trách nhiệm của cảnh sát giao thông.\"\n" +
                "Đáp án 1.\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("\"Câu 18: Tại nơi đường giao nhau, khi đèn điều khiển giao thông có tín hiệu vàng, người điều khiển phương\n" +
                "tiện như thế nào?\"\n", "\"1- Phải cho xe dừng lại trước vạch dừng,trừ trường hợp đã đi quá vạch dừng thì được đi tiếp; trong trường\n" +
                "hợp tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát, nhường đường cho\n" +
                "người đi bộ qua đường.\n" +
                "2- Phải cho xe nhanh chóng vượt qua vạch dừng để đi qua đường giao nhau và chú ý đảm bảo an toàn;\n" +
                "khi đèn tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát người đi bộ để đảm\n" +
                "bảo an toàn.\n" +
                "3- Cả 2 ý nêu trên.\"\n" +
                "Đáp án 2.\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("Câu 19: Biển báo hiệu đường bộ gồm những nhóm nào, ý nghĩa của từng nhóm?\n", "\"1- Nhóm biển báo cấm để biểu thị các điều cấm; nhóm biển báo hiệu nguy hiểm để cảnh báo các tình\n" +
                "huống nguy hiểm có thể xảy ra, nhóm biển hiệu lệnh để báo hiệu các hiệu lệnh phải thi hành.\n" +
                "2- Nhóm biển chỉ dẫn để chỉ dẫn hướng đi hoặc các điều biết; nhóm biển phụ để thuyết minh bổ sung các\n" +
                "loại biển báo cấm, biển báo nguy hiểm, biển hiệu lệnh và biển chỉ dẫn\"\n" +
                "Đáp án 1,2.\n"));
        mangHocLyThuyet.add(new Hoc_LT_KNQT("\"Câu 20: Tại nơi đường giao nhau, khi người điều khiển giao thông ra hiệu lệnh bằng hai tay hoặc một tay\n" +
                "giang ngang để báo hiệu thì người tham gia giao thông phải đi như thế nào là đúng quy tắc giao\n" +
                "thông?\"\n", "\"1- Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông phải dừng lại; người\n" +
                "tham gia giao thông ở phía bên phải và bên trái người điều khiển được đi.\n" +
                "2- Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông được đi thẳng;\n" +
                "người tham gia giao thông ở phía bên phải và bên trái người điều khiển giao thông được đi thẳng và rẽ\n" +
                "phải\"\n" +
                "Đáp án 1.\n"));

        HocLyThuyetKNQT_Adapter asd = new HocLyThuyetKNQT_Adapter(
                Activity_HocLyThuyet_KNQT.this,
                mangHocLyThuyet
        );
        lvHocLyThuyet.setAdapter(asd);
    }

}
