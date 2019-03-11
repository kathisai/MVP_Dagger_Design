package com.sample.wireviewer.screens.items;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import com.example.simpsonsviewer.R;
import com.sample.wireviewer.util.ActivityUtils;

import javax.inject.Inject;

import dagger.Lazy;
import dagger.android.support.DaggerAppCompatActivity;

public class ItemActivity extends DaggerAppCompatActivity {
    @Inject
    ItemPresenter mItemPresenter;
    @Inject
    Lazy<ItemFragment> itemFragmentProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the toolbar.
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();

        ItemFragment itemFragment =
                (ItemFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (itemFragment == null) {
            // Get the fragment from dagger
            itemFragment = itemFragmentProvider.get();
//            itemFragment = new ItemFragment();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), itemFragment, R.id.contentFrame);
        }

    }
}
