package com.example.banglaixe.Fragment;

import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.banglaixe.Adapter.BienBaoCamAdapter;
import com.example.banglaixe.Database.BienBaoCamDatabase;
import com.example.banglaixe.R;

import java.util.ArrayList;

public class FragmentBienBaoCam extends Fragment {
    ListView lvBienBao;
    ArrayList<FragmentBienBaoCam> arrayBienBaoCam;
    BienBaoCamAdapter adapter;
    private int Id;
    private String LoaiBienBao;
    private String NoiDung;
    private Drawable image;

    public FragmentBienBaoCam(int anInt, String string, String cursorString, byte[] blob) {
    }

    public FragmentBienBaoCam(int id, String loaiBienBao, String noiDung, Drawable Image, View mRootView) {
        Id = id;
        LoaiBienBao = loaiBienBao;
        NoiDung = noiDung;
        this.image = Image;
        this.mRootView = mRootView;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLoaiBienBao() {
        return LoaiBienBao;
    }

    public void setLoaiBienBao(String loaiBienBao) {
        LoaiBienBao = loaiBienBao;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public View getmRootView() {
        return mRootView;
    }

    public void setmRootView(View mRootView) {
        this.mRootView = mRootView;
    }
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_bien_bao_cam,container,false);
        return mRootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        BienBaoCamDatabase database = new BienBaoCamDatabase(getActivity(), "BienBao.sql", null, 1);

        database.QueryData("CREATE TABLE IF NOT EXISTS FragmentBienBaoCam(Id INTEGER PRIMARY KEY AUTOINCREMENT, LoaiBienBao VARCHAR(150), NoiDung VARCHAR(250), HinhAnh BLOB)");



        lvBienBao = (ListView) view.findViewById(R.id.listviewBienBaoCam);
        arrayBienBaoCam = new ArrayList<>();

        adapter = new BienBaoCamAdapter(getActivity(), R.layout.bien_bao_cam, arrayBienBaoCam);
        lvBienBao.setAdapter(adapter);

        Cursor cursor = database.GetData("SELECT * FROM FragmentBienBaoCam");
        while(cursor.moveToNext()){
            arrayBienBaoCam.add(new FragmentBienBaoCam(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getBlob(3)
            ));
        }
        adapter.notifyDataSetChanged();
    }
}
