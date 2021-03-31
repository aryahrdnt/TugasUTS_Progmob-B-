package com.example.film;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvfilm;
    private ArrayList<film> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvfilm = findViewById(R.id.rv_film);
        rvfilm.setHasFixedSize(true);

        list.addAll(DataFilm.getListdata());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvfilm.setLayoutManager(new LinearLayoutManager(this));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(list);
        rvfilm.setAdapter(listFilmAdapter);
    }
}
