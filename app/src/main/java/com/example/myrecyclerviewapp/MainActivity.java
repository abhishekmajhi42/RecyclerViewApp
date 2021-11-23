package com.example.myrecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = (RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] person = {"Abhishek", "Sudipta", "Ratikanta", "Ritik", "Rajeev", "Abhishek", "Sudipta", "Ratikanta", "Ritik", "Rajeev", "Abhishek", "Sudipta", "Ratikanta", "Ritik", "Rajeev", "Abhishek", "Sudipta", "Ratikanta", "Ritik", "Rajeev", "Abhishek", "Sudipta", "Ratikanta", "Ritik", "Rajeev", "Abhishek", "Sudipta", "Ratikanta", "Ritik", "Rajeev"};
        programmingList.setAdapter(new ProgrammingAdapter(person));

    }
}
