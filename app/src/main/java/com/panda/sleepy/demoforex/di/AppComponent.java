package com.panda.sleepy.demoforex.di;

import com.panda.sleepy.demoforex.app.DemoApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/*
 * Created by Anton Popov on 17.08.18.
 */
@Singleton
@Component (modules = { AndroidSupportInjectionModule.class,
        ActivityBuilder.class,
        AppModule.class })
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(DemoApp app);

        AppComponent build();
    }

    void inject(DemoApp app);

}
