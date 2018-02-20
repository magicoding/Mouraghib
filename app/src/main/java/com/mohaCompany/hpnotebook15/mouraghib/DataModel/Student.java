package com.mohaCompany.hpnotebook15.mouraghib.DataModel;



public class Student extends User{

    private YearLevel studentLevel;
    private Parent father;
    private Parent mother;

    public Student(String name, String email, int phoneNumber,int userID, YearLevel studentLevel,Parent father, Parent mother){
        super(name,email,phoneNumber,userID);

        this.studentLevel = studentLevel;
        this.father = father;
        this.mother = mother;

    }

}
