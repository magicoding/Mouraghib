package com.mohaCompany.hpnotebook15.mouraghib.DataModel;

import java.util.ArrayList;


public class Parent extends User{

    private ArrayList<Student> enfants;

    public Parent(String name,String email, int phoneNumber,int userID, ArrayList<Student> enfants){
        super(name,email,phoneNumber,userID);
        this.enfants = enfants;
    }

}
