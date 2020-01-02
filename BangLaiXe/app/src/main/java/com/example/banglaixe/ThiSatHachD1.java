package com.example.banglaixe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class ThiSatHachD1 extends AppCompatActivity {
    private TextView textViewQuestion;
    private TextView textviewQuestionCount;
    private TextView textViewCountDown;
    private RadioGroup rdGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Button btnConfirm;

    private List<question> questionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_sat_hach_d1);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        textviewQuestionCount = findViewById(R.id.time_question);
        rdGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_btn1);
        rb2 = findViewById(R.id.radio_btn2);
        rb3 = findViewById(R.id.radio_btn3);
        btnConfirm = findViewById(R.id.btnConfirm);

        SatHachDbHelper dbHelper = new SatHachDbHelper(this);
        questionList = dbHelper.getAllQuestion();
    }
}
