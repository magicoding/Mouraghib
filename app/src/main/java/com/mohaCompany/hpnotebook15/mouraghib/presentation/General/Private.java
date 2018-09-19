package com.mohaCompany.hpnotebook15.mouraghib.presentation.General;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mohaCompany.hpnotebook15.mouraghib.R;
import com.mohaCompany.hpnotebook15.mouraghib.presentation.ParentActivities.ParentLoginActivity;
import com.mohaCompany.hpnotebook15.mouraghib.presentation.StudentActivities.StudentLoginActivity;
import com.mohaCompany.hpnotebook15.mouraghib.presentation.StuffActivities.StuffLoginActivit;

public class Private extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);
    }
    public void studentLogin(View view) {
        Intent intent = new Intent(this, StudentLoginActivity.class);
        startActivity(intent);
    }

    public void parentLogin(View view) {
        Intent intent = new Intent(this, ParentLoginActivity.class);
        startActivity(intent);
    }

    public void stuffLogin(View view) {
        Intent intent = new Intent(this, StuffLoginActivit.class);
        startActivity(intent);
    }
}
