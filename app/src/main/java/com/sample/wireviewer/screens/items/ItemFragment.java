package com.sample.wireviewer.screens.items;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simpsonsviewer.R;
import com.sample.wireviewer.di.ActivityScoped;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
@ActivityScoped
public class ItemFragment extends Fragment implements ItemContract.View {

    @Inject
    public ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item, container, false);
    }

}
