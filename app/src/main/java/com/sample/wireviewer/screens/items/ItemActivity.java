package com.sample.wireviewer.screens.items;

import android.os.Bundle;
import android.view.Menu;

import com.example.simpsonsviewer.R;
import com.sample.wireviewer.util.ActivityUtils;

import javax.inject.Inject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
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
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), itemFragment, R.id.contentFrame);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item_activity, menu);
        return true;
    }
}
