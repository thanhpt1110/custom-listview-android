package com.example.customlistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();
    CustomAdapter studentAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add data to ArrayList
        addData();

        // Truyền vào Activity cần tạo listView, Layout cần custom (cái có 2 txtView) và dữ liệu ArrayList
        studentAdapter = new CustomAdapter(this, R.layout.custom_listview, students);

        // Listview tự động dò hết dữ liệu trong ArrayList
        ListView listView = findViewById(R.id.listViewStudent);
        listView.setAdapter(studentAdapter);
    }

    private void addData()
    {
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
        students.add(new Student("Phan Tuấn Thành", "11/10/2003"));
    }
}