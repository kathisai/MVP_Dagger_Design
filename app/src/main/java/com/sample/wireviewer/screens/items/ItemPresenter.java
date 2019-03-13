package com.sample.wireviewer.screens.items;

import com.sample.wireviewer.di.ActivityScoped;

import javax.inject.Inject;

import androidx.annotation.Nullable;

@ActivityScoped
public class ItemPresenter implements ItemContract.Presenter {

    @Nullable
    private ItemContract.View mItemView;

    @Inject
    ItemPresenter() {

    }

    @Override
    public void subscribeView(ItemContract.View view) {
        this.mItemView = view;

    }

    @Override
    public void unSubscribeView() {

    }
}
