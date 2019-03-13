package com.sample.wireviewer.di;

import android.app.Application;

import com.sample.wireviewer.application.ViewerApplication;
import com.sample.wireviewer.di.network.RetrofitModule;
import com.sample.wireviewer.network.APIInterface;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class, ActivityModule.class, AndroidSupportInjectionModule.class, RetrofitModule.class})
public interface AppComponent extends AndroidInjector<ViewerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }

    APIInterface getApiInterface();

}
