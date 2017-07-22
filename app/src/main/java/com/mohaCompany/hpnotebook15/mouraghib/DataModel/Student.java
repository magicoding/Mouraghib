package com.mohaCompany.hpnotebook15.mouraghib.DataModel;

/**
 * Created by HPnotebook15 on 2017-07-21.
 */

public class Student {
    private String name;
    private int studentNum;
    private int studentLevel;
    private Parent father;
    private Parent mother;

    public Student(String name, int studentNum, int studentLevel,Parent father, Parent mother){
        this.name = name;
        this.studentNum = studentNum;
        this.studentLevel = studentLevel;
        this.father = father;
        this.mother = mother;

    }

}
