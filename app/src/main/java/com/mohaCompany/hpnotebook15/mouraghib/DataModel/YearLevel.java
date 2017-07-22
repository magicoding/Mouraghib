package com.mohaCompany.hpnotebook15.mouraghib.DataModel;

import java.util.ArrayList;

/**
 * Created by HPnotebook15 on 2017-07-21.
 */

public class YearLevel {
    private int year;
    private int capacity;
    private int numStudentIn;
    private ArrayList<Student> studentsIn;
    private ArrayList<Stuff> teachers;

    public YearLevel(int year, int capacity, int numStudentIn){
        this.year = year;
        this.capacity = capacity;
        this.numStudentIn = numStudentIn;
        studentsIn = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student newStudent){
        studentsIn.add(newStudent);
    }

    public void addTeacher(Stuff teacher){
        teachers.add(teacher);
    }
}
