package com.example.banglaixe;

import android.provider.BaseColumns;

public final class SatHachContract {

    private SatHachContract(){}

    public static class QuestionTable implements BaseColumns {
        public static final String Table_Name = "SatHach_question";
        public static final String COLUMN_QUESTION =  "question";
        public static final String COLUMN_OPTION1=  "option1";
        public static final String COLUMN_OPTION2 =  "optione2";
        public static final String COLUMN_OPTION3 =  "optione3";
        public static final String COLUMN_AMSWER =  "answer";
    }
}
