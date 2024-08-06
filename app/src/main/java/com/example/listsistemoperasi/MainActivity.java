package com.example.listsistemoperasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<sistemoperasimodel> OSlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getlist();
        if (savedInstanceState!=null){
            OSlist = savedInstanceState.getParcelableArrayList("key");
            adapter = new Adapter(OSlist);
        }
        recyclerView = findViewById(R.id.recycleview);
        adapter = new Adapter(OSlist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);




    }
    public void getlist(){
        OSlist = new ArrayList<>();
        OSlist.add(new sistemoperasimodel("Android","Deskripsi",R.drawable.android));
        OSlist.add(new sistemoperasimodel("Black Berry","Deskripsi",R.drawable.bb));
        OSlist.add(new sistemoperasimodel("IOS","Deskripsi",R.drawable.ios));
        OSlist.add(new sistemoperasimodel("Kali Linux","Deskripsi",R.drawable.kali));
        OSlist.add(new sistemoperasimodel("Mac OS","Deskripsi",R.drawable.macos));
        OSlist.add(new sistemoperasimodel("Ubuntu","Deskripsi",R.drawable.ubuntu));
        OSlist.add(new sistemoperasimodel("Web OS","Deskripsi",R.drawable.webos));
        OSlist.add(new sistemoperasimodel("Windows 7","Deskripsi",R.drawable.windows7));
        OSlist.add(new sistemoperasimodel("Windows Mobile","Deskripsi",R.drawable.windowsmobile));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putParcelableArrayList("key",OSlist);
        super.onSaveInstanceState(outState);



    }



}