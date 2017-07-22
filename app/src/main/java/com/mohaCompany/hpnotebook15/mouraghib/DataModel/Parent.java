package com.mohaCompany.hpnotebook15.mouraghib.DataModel;

import java.util.ArrayList;

/**
 * Created by HPnotebook15 on 2017-07-21.
 */

public class Parent {
    private String name;
    private String email;
    private int phoneNumber;
    private ArrayList<Student> enfants;

    public Parent(String name,String email, int phoneNumber, ArrayList<Student> enfants){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.enfants = enfants;
    }

}
