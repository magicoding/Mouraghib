package com.mohaCompany.hpnotebook15.mouraghib.presentation.General;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mohaCompany.hpnotebook15.mouraghib.R;

public class Tab1Events extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_events, container, false);
        return rootView;
    }
}
