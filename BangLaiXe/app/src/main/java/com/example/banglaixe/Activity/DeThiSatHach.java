package com.example.banglaixe.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.banglaixe.Activity.Activity_ThiSatHach;
import com.example.banglaixe.Object.question;
import com.example.banglaixe.R;
import com.example.banglaixe.Tubycastu.SatHachDbHelper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class DeThiSatHach extends AppCompatActivity {
    public static final String EXTRA_SCORE = "Điểm lớn nhất";
    private static final long countDownMili = 30000;

    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textviewQuestionCount;
    private TextView textViewCategory;
    private TextView textViewCountDown;
    private RadioGroup rdGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Button btnConfirm;

    private Long backPressTime;

    private ColorStateList textColorDefaultRb;
    private ColorStateList textColorDefaultCd;

    private CountDownTimer countDownTimer;
    private long timeLeft;

    private ArrayList<question> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private question currentQuestion;

    private int score;
    private boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_thi_sat_hach);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewScore = findViewById(R.id.txtscore);
        textviewQuestionCount = findViewById(R.id.txtQuestionCount);
        textViewCategory = findViewById(R.id.txtCategory);
        textViewCountDown = findViewById(R.id.time_question);
        rdGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_btn1);
        rb2 = findViewById(R.id.radio_btn2);
        rb3 = findViewById(R.id.radio_btn3);
        btnConfirm = findViewById(R.id.btnConfirm);
        backPressTime=0L;
        textColorDefaultRb = rb1.getTextColors();
        textColorDefaultCd = textViewCountDown.getTextColors();




        Intent intent = getIntent();
        int categoryID = intent.getIntExtra(Activity_ThiSatHach.CATEGORY_ID,0);
        String categoryName = intent.getStringExtra(Activity_ThiSatHach.CATEGORY_NAME);

        textViewCategory.setText("Đề : "+categoryName);

        SatHachDbHelper dbHelper = SatHachDbHelper.getInstance(this);

        questionList = dbHelper.getQuestions(categoryID);
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);
        showNextQuestion();


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!answered){
                    if(rb1.isChecked() ||rb2.isChecked() ||rb3.isChecked()){
                        checkAnswer();
                    }else {
                        Toast.makeText(DeThiSatHach.this , "vui long nhap dap an", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    showNextQuestion();
                }

            }
        });
    }

    private void showNextQuestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rdGroup.clearCheck();

        if(questionCounter < questionCountTotal){
            currentQuestion = questionList.get(questionCounter);

            textViewQuestion.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());

            questionCounter++;
            textviewQuestionCount.setText("Câu hỏi số: " + questionCounter + "/" + questionCountTotal);
            answered = false;
            btnConfirm.setText("Xác nhận");

            timeLeft = countDownMili;
            startCountDown();

        }else{
            finishQuestion();
        }
    }

    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeft,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeft = 0;
                updateCountDownText();
                checkAnswer();
            }


        }.start();
    }

    private void updateCountDownText(){
        int minutes =(int) (timeLeft/1000) / 60;
        int secons = (int) (timeLeft/1000) %60;

        String timeFormat = String.format(Locale.getDefault(),"%02d:%02d",minutes,secons);

        textViewCountDown.setText(timeFormat);

        if(timeLeft<10000){
            textViewCountDown.setTextColor(Color.RED);
        }else{
            textViewCountDown.setTextColor(textColorDefaultCd);
        }
    }

        private void checkAnswer(){
        answered = true;

        countDownTimer.cancel();

        RadioButton rbSelected = findViewById(rdGroup.getCheckedRadioButtonId());
        int answer = rdGroup.indexOfChild(rbSelected)+1;
        if(answer == currentQuestion.getAnswer()){
            score++;
            textViewScore.setText("Điểm : " + score);
        }

        showSolution();
    }

    private void showSolution() {
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);

        switch (currentQuestion.getAnswer()){
            case 1:
                rb1.setTextColor(Color.GREEN);
                textViewQuestion.setText("Dap an A dung");
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                textViewQuestion.setText("Dap an B dung");
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                textViewQuestion.setText("Dap an C dung");
                break;
        }

        if(questionCounter <questionCountTotal){
            btnConfirm.setText("tiep tuc");
        }else {
            btnConfirm.setText("Kết thúc");
        }

    }


    private void finishQuestion() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(DeThiSatHach.this);
        dialog.setTitle("Chúc mừng bạn đã kết thúc bài thi")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });



        if(score <= 5){

            dialog.setMessage("Và bạn đạt được : " + score + " điểm.\nBạn quá tệ!!!....hãy thử lại sau!!!");
        }else if(score >5 && score <10){
            dialog.setMessage("Và bạn đạt được : " + score + " điểm.\nSố điểm tạm chất nhận được!!...Hãy cố gắng hơn lần sau nhé.");

        }else {
            dialog.setMessage("Và bạn đạt được : " + score + " điểm.\nBài thi rất tốt ^^");
        }

        AlertDialog asd = dialog.create();
        asd.show();
//        Intent resultIntent = new Intent();
//        resultIntent.putExtra(EXTRA_SCORE, score);
//        setResult(RESULT_OK, resultIntent);


    }


    @Override
    public void onBackPressed() {
        if(backPressTime +2000 > System.currentTimeMillis()){
            finishQuestion();
        }else{
            Toast.makeText(this, "Bạn có chắc chắn muốn thoát", Toast.LENGTH_SHORT).show();
        }

        backPressTime = System.currentTimeMillis();
    }

    protected void onDestroy() {
        super.onDestroy();
        if(countDownTimer != null){
            countDownTimer.cancel();
        }
    }
}
