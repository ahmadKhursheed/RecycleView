package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Student> studentList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter();
    }

    private void setListAdapter() {
        Student s0=new Student("1", "Ali", "Male", R.drawable.m);
        Student s1=new Student("2", "Usman", "Male", R.drawable.m);
        Student s2=new Student("3", "Shahzad", "Male",R.drawable.m);
        Student s3=new Student("4", "Hassan", "Male", R.drawable.m);
        Student s4=new Student("5", "Hamza", "Male", R.drawable.m);
        Student s5=new Student("6", "Ahmed", "Male",R.drawable.m);
        Student s6=new Student("7", "Ayesha", "Female",R.drawable.f);
        Student s7=new Student("8", "Amna", "Female",R.drawable.f);
        Student s8=new Student("9", "Uzma", "Female", R.drawable.f);



        studentList.addAll(Arrays.asList(new Student[]{s0,s1,s2,s3,s4,s5,s6,s7,s8}));
        recyclerView = findViewById(R.id.recycleView);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(studentList,MainActivity.this) {

        };

        recyclerView.setAdapter(adapter);
    }


}