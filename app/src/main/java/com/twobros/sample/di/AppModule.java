package com.twobros.sample.di;

import android.app.Application;
import android.content.Context;

import com.twobros.sample.App;
import com.twobros.sample.util.SingleLiveEvent;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    @Singleton
    Application provideApp(App app){
        return app;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Context provideContext(App app){
        return app;
    }

    @Singleton
    @Provides
    @Named("errorEvent")
    SingleLiveEvent<Throwable> providerErrorEvent(){
        return new SingleLiveEvent<>();
    }
}
