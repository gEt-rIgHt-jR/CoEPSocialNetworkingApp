package com.aceshub.coepsocialnetworkingapp.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aceshub.coepsocialnetworkingapp.R;

public class SavedQuestionsFragment extends Fragment {


    public SavedQuestionsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_saved_questions, container, false);
    }

}
