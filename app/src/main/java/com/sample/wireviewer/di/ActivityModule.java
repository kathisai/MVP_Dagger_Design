package com.sample.wireviewer.di;

import com.sample.wireviewer.di.items.ItemModule;
import com.sample.wireviewer.screens.items.ItemActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = ItemModule.class)
    abstract ItemActivity itemActivity();

}
