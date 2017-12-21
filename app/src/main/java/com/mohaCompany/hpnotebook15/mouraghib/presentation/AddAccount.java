package com.mohaCompany.hpnotebook15.mouraghib.presentation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mohaCompany.hpnotebook15.mouraghib.R;

import java.util.HashMap;

public class AddAccount extends AppCompatActivity {

    private Button registerBtn;
    private EditText name;
    private EditText email;
    private EditText studNum;
    private EditText studClass;

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

        //initialize firbase variables
        myRef = FirebaseDatabase.getInstance().getReference();


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRegister();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private void startRegister(){
        String accName = this.name.getText().toString().trim();
        String accEmail = this.email.getText().toString().trim();
        String studNum = this.studNum.getText().toString().trim();
        String studClass = this.studClass.getText().toString().trim();

        HashMap<String,String> dataMap = new HashMap<String, String>();

        dataMap.put("AccountName",accName);
        dataMap.put("AccountEmail",accEmail);
        dataMap.put("StudentNum",studNum);
        dataMap.put("StudentClass",studClass);

        myRef.child("Students").child("3rd year").setValue(dataMap);

        finish();
    }

}
