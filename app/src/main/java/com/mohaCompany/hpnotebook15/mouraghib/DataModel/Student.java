package com.mohaCompany.hpnotebook15.mouraghib.DataModel;



public class Student extends User{

    private String studentLevel;
    private String fatherID;
    private String motherID;

    public Student(String name, String email, int phoneNumber,int userID, String studentLevel,String fatherID, String motherID){
        super(name,email,phoneNumber,userID);

        this.studentLevel = studentLevel;
        this.fatherID = fatherID;
        this.motherID = motherID;

    }

}
