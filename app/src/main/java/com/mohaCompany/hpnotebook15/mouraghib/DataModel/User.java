package com.mohaCompany.hpnotebook15.mouraghib.DataModel;


public abstract class User {
    private int userID;
    private String name;
    private String email;
    private int phoneNumber;


    public User(String name,String email, int phoneNumber,int userID){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int getUserID(){
        return userID;
    }


}
