package com.mohaCompany.hpnotebook15.mouraghib.presentation.StuffActivities;

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

    }
    private void startRegister(){
        String accName = this.name.getText().toString().trim();
        String accEmail = this.email.getText().toString().trim();
        String studNum = this.studNum.getText().toString().trim();
        String studClass = this.studClass.getText().toString().trim();

        User teacher = new Stuff(accName,accEmail,2049309013,Integer.parseInt(studNum),"Math");

        HashMap<String,String> dataMap = new HashMap<String, String>();

        dataMap.put(""+teacher.getUserID(),accName  );
        myRef.child("Stuff").child("teachers").setValue(dataMap);



        finish();
    }

}
