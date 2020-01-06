package com.example.banglaixe.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.banglaixe.R;
import com.example.banglaixe.ThiSatHachD1;

public class Activity_ThiSatHach extends AppCompatActivity {
    ListView listView;
    String Title[]= {"Đề 1","Đề 2","Đề 3"};
    String Question[]= {"0/15 câu","0/15 câu","0/15 câu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_sat_hach);

        listView = findViewById(R.id.listView);
        Activity_ThiSatHach.myAdapter adapter = new Activity_ThiSatHach.myAdapter(this, Title,Question);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Activity_ThiSatHach.this , ThiSatHachD1.class);
                startActivity(intent);
            }
        });

    }
    class myAdapter extends ArrayAdapter<String> {
        Context context;
        String aTitle[];
        String aQuestion[];


        myAdapter(Context c ,String title[], String question[]){
            super(c,R.layout.list_hoc_ly_thuyet,R.id.title,title);
            this.context= c;
            this.aTitle =title;
            this.aQuestion = question;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.list_cau_hoi, parent, false);
            TextView myTitle = row.findViewById(R.id.title);
            TextView myQuestion = row.findViewById(R.id.question);


            myTitle.setText(Title[position]);
            myQuestion.setText(Question[position]);


            return row;
        }
    }
}
