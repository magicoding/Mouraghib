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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Student> getEnfants() {
        return enfants;
    }

    public void setEnfants(ArrayList<Student> enfants) {
        this.enfants = enfants;
    }
}
