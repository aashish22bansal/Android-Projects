package com.example.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Accessing the RecyclerView in XML File
        RecyclerView programmingList = (RecyclerView) findViewById(R.id.programmingList);

        // Setting Up Layout Manager
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        // Creating an Array Variable
        String[] languages ={"Java", "C", "C++", "Python", "R", "Jupyter"};

        // Setting Up Adapter
        programmingList.setAdapter(new ProgrammingAdapter(languages));
    }
}