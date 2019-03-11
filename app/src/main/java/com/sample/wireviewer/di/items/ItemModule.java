package com.sample.wireviewer.di.items;

import com.sample.wireviewer.di.ActivityScoped;
import com.sample.wireviewer.di.FragmentScoped;
import com.sample.wireviewer.screens.items.ItemContract;
import com.sample.wireviewer.screens.items.ItemFragment;
import com.sample.wireviewer.screens.items.ItemPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ItemModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract ItemFragment itemFragment();

    @ActivityScoped
    @Binds
    abstract ItemContract.Presenter itemPresenter(ItemPresenter presenter);
}
