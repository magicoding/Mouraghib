package com.mohaCompany.hpnotebook15.mouraghib.DataModel;

import java.util.ArrayList;

public class YearLevel {
    private int year;
    private int capacity;
    private int numStudentIn;
    private ArrayList<Student> studentsIn;
    private ArrayList<Stuff> teachers;

    public YearLevel(int year, int capacity, int numStudentIn) {
        this.year = year;
        this.capacity = capacity;
        this.numStudentIn = numStudentIn;
        studentsIn = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student newStudent) {
        studentsIn.add(newStudent);
    }

    public void addTeacher(Stuff teacher) {
        teachers.add(teacher);
    }

    public Student findStudent(int userID) {
        Student student;
        boolean check = false;
        Student currentStudent;
        if (studentsIn != null) {
            for (int i = 0; i < studentsIn.size(); i++) {
                currentStudent = studentsIn.get(i);
                if (currentStudent.getUserID()==userID){
                    student = currentStudent;
                    return student;

                }
            }
            check=true;
        }
        if (check){
            return null;
        }
        return null;
    }

}
