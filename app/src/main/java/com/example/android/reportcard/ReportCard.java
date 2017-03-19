package com.example.android.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.y;
import static java.sql.DriverManager.println;

/**
 * Created by paulstyslinger on 2/13/17.
 */

public class ReportCard {

    // student_name, class_year, grades (on A-F scale)
    private String mStudent_name;
    private int mClass_year;
    private ArrayList<String> mGrades = new ArrayList<String>();


    public ReportCard(String student_name, int class_year, ArrayList<String> grades) {
        mStudent_name = student_name;
        mClass_year = class_year;
        mGrades = grades;
    }


    //Setter Methods
    public void addGrade(String newGrade) {
        mGrades.add(newGrade);
    }

    //Getter Methods
    public String getStudentName() {
        return mStudent_name;
    }

    public int getClassYear() {
        return mClass_year;
    }

    public void showGrades() {
        for (int i = 0; i < mGrades.size(); i++) {
            System.out.println(mGrades.get(i));
        }
    }

    public void setClassYear(int year) {
        mClass_year = year;
    }

    public void setStudentName(String name) {
        mStudent_name = name;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudent_name='" + mStudent_name + '\'' +
                ", mClass_year=" + mClass_year +
                ", mGrades=" + mGrades +
                '}';
    }

}
