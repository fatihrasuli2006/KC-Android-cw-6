package com.example.android.cw_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     */

    ArrayList<Object> Student = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */

        TextView textView = findViewbyId(R.id.changeStudent);
        Intent intent = new Intent();
        string name = "a";
        Student student1;

        Object s1 = new Student( "حمد",14,12,R.drawable.boy);
        Object s2 = new Student( "سلمان",13,10,R.drawable.boy1);
        Object s3 = new Student( "ماجد",15,11,R.drawable.boy2);
        Object s4 = new Student( "فاتح",16,11,R.drawable.boy4);


        Student.add(s1);
        Student.add(s2);
        Student.add(s3);
        Student.add(s4);



        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}