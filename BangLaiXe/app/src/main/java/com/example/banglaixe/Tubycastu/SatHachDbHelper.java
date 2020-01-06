package com.example.banglaixe.Tubycastu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.banglaixe.Object.question;
import com.example.banglaixe.Tubycastu.SatHachContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SatHachDbHelper extends SQLiteOpenHelper {
    private static final String DatabaseName = "MyAwesomeSatHach.db";
    private static final int DatabaseVersion = 1;
    private SQLiteDatabase db;

    public SatHachDbHelper(@Nullable Context context) {
        super(context, DatabaseName, null, DatabaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SqlCreateQuestion = "CREATE TABLE " +
                QuestionTable.Table_Name+ " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_AMSWER + " INTEGER " + " ) ";

        db.execSQL(SqlCreateQuestion);
        fillQuestionTable();



    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.Table_Name);
        onCreate(db);
    }
    private void fillQuestionTable() {
        question q1 = new question("A la dap an dung" , "A", "B", "C",1);
        addQuestion(q1);
        question q2 = new question("B la dap an dung" , "A", "B", "C",2);
        addQuestion(q1);
        question q3 = new question("C la dap an dung" , "A", "B", "C",3);
        addQuestion(q1);
        question q4 = new question("A la dap an dung lan nua" , "A", "B", "C",1);
        addQuestion(q1);
        question q5 = new question("B la dap an dung lan nua" , "A", "B", "C",2);
        addQuestion(q1);
    }
    private void addQuestion(question Question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, Question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, Question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, Question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, Question.getOption3());
        cv.put(QuestionTable.COLUMN_AMSWER, Question.getAnswer());

        db.insert(QuestionTable.Table_Name , null ,cv);
    }
    public List<question> getAllQuestion(){
        List<question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM "+ QuestionTable.Table_Name , null);

        if( c.moveToFirst()){
            do{
                question question = new question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setAnswer(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_AMSWER)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
