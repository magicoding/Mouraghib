package com.mohaCompany.hpnotebook15.mouraghib.presentation.StuffActivities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mohaCompany.hpnotebook15.mouraghib.DataModel.Parent;
import com.mohaCompany.hpnotebook15.mouraghib.DataModel.Student;
import com.mohaCompany.hpnotebook15.mouraghib.DataModel.Stuff;
import com.mohaCompany.hpnotebook15.mouraghib.DataModel.User;
import com.mohaCompany.hpnotebook15.mouraghib.DataModel.YearLevel;
import com.mohaCompany.hpnotebook15.mouraghib.R;

import java.util.HashMap;

public class AddAccount extends AppCompatActivity {

    private Button registerBtn;
    private EditText name;
    private EditText email;
    private EditText studNum;
    private EditText studClass;
    private EditText fatherID;
    private EditText motherID;

    //firbase variables
    private DatabaseReference myRef;
    private FirebaseDatabase chid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initialize button
        registerBtn = (Button) findViewById(R.id.registerBTN_field);

        //initialize editText Views
        name = (EditText) findViewById(R.id.AccName_field);
        email = (EditText) findViewById(R.id.AccEmail_field);
        studNum = (EditText) findViewById(R.id.studentNum_field);
        studClass = (EditText) findViewById(R.id.studClass_field);
        fatherID = (EditText) findViewById(R.id.fatherID_field);
        motherID = (EditText) findViewById(R.id.motherID_field);
        //initialize firbase variables
        myRef = FirebaseDatabase.getInstance().getReference();


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRegister();
            }
        });

    }

    private void startRegister(){
        String accName = this.name.getText().toString().trim();
        String accEmail = this.email.getText().toString().trim();
        String studNum = this.studNum.getText().toString().trim();
        String studClass = this.studClass.getText().toString().trim();
        String fatherID = this.fatherID.getText().toString().trim();
        String motherID = this.motherID.getText().toString().trim();

        Student student = new Student(accName,accEmail,0,Integer.parseInt(studNum),studClass,fatherID,motherID);

        HashMap<String,Object> dataMap = new HashMap<String, Object>();

        dataMap.put(""+student.getUserID(),student);

        switch(studClass){
            case "1st college":
                myRef.child("Students").child("1st college").setValue(dataMap);
                break;
            case "2nd college":
                myRef.child("Students").child("2nd college").updateChildren(dataMap);
                break;
            case "3rd college":
                myRef.child("Students").child("3rd college").updateChildren(dataMap);

                break;
            case "Brevet":
                myRef.child("Students").child("Brevet").updateChildren(dataMap);
                break;
            case "1st Lycee":
                myRef.child("Students").child("1st Lycee").updateChildren(dataMap);
                break;
            case "2nd Lycee":
                myRef.child("Students").child("2nd Lycee").updateChildren(dataMap);
                break;
            case "Baccalaureat":
                myRef.child("Students").child("Baccalaureat").updateChildren(dataMap);
                break;
            default:
                Toast.makeText(AddAccount.this,
                        "Incorrect Student Class", Toast.LENGTH_LONG).show();
                //startRegister();
                break;
        }




        finish();
    }

}
