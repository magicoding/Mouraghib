package com.mohaCompany.hpnotebook15.mouraghib.DataModel;

/**
 * Created by HPnotebook15 on 2017-07-21.
 */

public class Student {
    private String Name;
    private int studentNum;
    private int studentLevel;

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(int studentLevel) {
        this.studentLevel = studentLevel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
