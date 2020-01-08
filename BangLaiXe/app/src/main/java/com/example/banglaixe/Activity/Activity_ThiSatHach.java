package com.example.banglaixe.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



import com.example.banglaixe.Object.Category;
import com.example.banglaixe.R;
import com.example.banglaixe.Tubycastu.SatHachDbHelper;


import java.util.List;

public class Activity_ThiSatHach extends AppCompatActivity {


    private static final int RequestCodeQuestion = 1;
    public static final String CATEGORY_ID = "categoryID";
    public static final String CATEGORY_NAME = "categoryNAME";

    public static final String SHARED_PREF = "Chia sẻ trước";
    public static final String KEY_HighScore = "Điểm cao hơn";

    private TextView textViewHighScore;
    private int highscore;

    private Spinner categorySpinner;

    //SharedPreferences sharedPref;
    //Activity_ThiSatHach.myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thi_sat_hach);

        categorySpinner = findViewById(R.id.spinner_category);
        textViewHighScore = findViewById(R.id.txtHighscore);

        loadCategory();
        loadHighScore();

        Button btnStartQuestion = findViewById(R.id.btnStart);
        btnStartQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Category selectedCategory = (Category) categorySpinner.getSelectedItem();
                int categoryID = selectedCategory.getId();
                String categoryNAME = selectedCategory.getName();
                Intent intent = new Intent(Activity_ThiSatHach.this , DeThiSatHach.class);
                intent.putExtra(CATEGORY_ID,categoryID);
                intent.putExtra(CATEGORY_NAME,categoryNAME);
                startActivityForResult(intent, RequestCodeQuestion);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RequestCodeQuestion){
            if(requestCode == RESULT_OK){
                int score = data.getIntExtra(DeThiSatHach.EXTRA_SCORE , 0);
                if(score > highscore){
                    updateHighScore(score);
                }
            }
        }
    }

    private void loadCategory(){
        SatHachDbHelper dbHelper = SatHachDbHelper.getInstance(this);
        List<Category> categories = dbHelper.getAllCategories();

        ArrayAdapter<Category> adapterCategories = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, categories);
        adapterCategories.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapterCategories);
    }

    private void loadHighScore(){
        SharedPreferences pref = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
        highscore = pref.getInt(KEY_HighScore,0);
        textViewHighScore.setText("Điểm cao : " +highscore);
    }
    private void updateHighScore(int highScoreNew){
        highscore= highScoreNew;
        textViewHighScore.setText("Điểm cao : "+ highscore);

        SharedPreferences pref = getSharedPreferences(SHARED_PREF , MODE_PRIVATE);
        SharedPreferences.Editor editor =pref.edit();
        editor.putInt(KEY_HighScore, highscore);
        editor.apply();
    }
}
