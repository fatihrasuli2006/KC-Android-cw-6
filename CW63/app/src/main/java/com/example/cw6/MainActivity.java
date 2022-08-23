package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentStudent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.changeButton);
        Button backButton = findViewById(R.id.backButton);
        ImageView studentPhotoView = findViewById(R.id.studentImageView);
        TextView studentNameView = findViewById(R.id.studentNameView);
        TextView studentAgeView = findViewById(R.id.studentAgeView);
        TextView studentGradeView = findViewById(R.id.studentGradeView);
        Intent intent = new Intent();
        String name = "fatih";
        Student s1 = new Student("يوسف",14,12,R.drawable.b1);
        Student s2 = new Student("سلمان",13,10,R.drawable.b2);
        Student s3 = new Student("ماجد",15,11,R.drawable.b4);
        Student s4 = new Student("فاتح",16,11,R.drawable.b3);

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        studentPhotoView.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
        studentNameView.setText(studentArrayList.get(currentStudent).getStudentName());
        studentAgeView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
        studentGradeView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;
                studentPhotoView.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
                studentNameView.setText(studentArrayList.get(currentStudent).getStudentName());
                studentAgeView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                studentGradeView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent--;
                studentPhotoView.setImageResource(studentArrayList.get(currentStudent).getStudentphoto());
                studentNameView.setText(studentArrayList.get(currentStudent).getStudentName());
                studentAgeView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                studentGradeView.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

            }
        });
    }
}