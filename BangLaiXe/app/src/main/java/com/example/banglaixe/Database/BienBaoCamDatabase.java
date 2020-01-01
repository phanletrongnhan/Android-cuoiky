package com.example.banglaixe.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import androidx.annotation.Nullable;

public class BienBaoCamDatabase extends SQLiteOpenHelper {

    public BienBaoCamDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void QueryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }
    public void INSERT_FragmenBienBaoCam(String LoaiBienBao, String NoiDung, byte[] hinh){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO FragmentBienBaoCam VALUES(null, ?, ?, ?)";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1,LoaiBienBao);
        statement.bindString(2,NoiDung);
        statement.bindBlob(3, hinh);

        statement.executeInsert();
    }
    public Cursor GetData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql,null );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
