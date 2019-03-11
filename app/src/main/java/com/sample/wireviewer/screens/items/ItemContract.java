package com.sample.wireviewer.screens.items;

import com.sample.wireviewer.mvp.BasePresenter;
import com.sample.wireviewer.mvp.BaseView;

public interface ItemContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter<View> {

    }
}
