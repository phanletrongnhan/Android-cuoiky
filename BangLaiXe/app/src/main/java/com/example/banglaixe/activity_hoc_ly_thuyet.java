package com.example.banglaixe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class activity_hoc_ly_thuyet extends AppCompatActivity {
    ListView listView;
    String Title[]= {"Khái niệm và quy tắc","Hệ thống biển báo đường bộ","Các thế sa hình","Văn hóa, đạo đức nghề nghiệp người lái xe"};
    String Question[]= {"0/75 câu","0/35 câu","0/35 câu","0/5 câu",};
    int Image[] = {R.drawable.gmail,R.drawable.cauhoisai,R.drawable.gmail,R.drawable.gmail};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_ly_thuyet);

        listView = findViewById(R.id.listView);
        myAdapter adapter = new myAdapter(this, Title,Question,Image);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
    class myAdapter extends ArrayAdapter<String>{
        Context context;
        String aTitle[];
        String aQuestion[];
        int aImage[];

        myAdapter(Context c ,String title[], String question[], int image[]){
            super(c,R.layout.list_hoc_ly_thuyet,R.id.title,title);
            this.context= c;
            this.aTitle =title;
            this.aQuestion = question;
            this.aImage = image;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.list_hoc_ly_thuyet, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.title);
            TextView myQuestion = row.findViewById(R.id.question);

            images.setImageResource(Image[position]);
            myTitle.setText(Title[position]);
            myQuestion.setText(Question[position]);


            return row;
        }
    }
}
