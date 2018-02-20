package com.mohaCompany.hpnotebook15.mouraghib.DataModel;



public class Stuff extends User{

    private String profession;


    public Stuff(String name, String email, int phoneNumber,int userID, String profession){
        super(name,email,phoneNumber,userID);
        this.profession = profession;
    }


}
