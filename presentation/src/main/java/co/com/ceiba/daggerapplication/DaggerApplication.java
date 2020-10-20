package co.com.ceiba.daggerapplication;

import android.app.Application;

import co.com.ceiba.daggerapplication.dependencyinjection.ApplicationComponent;
import co.com.ceiba.daggerapplication.dependencyinjection.ContextModule;
import co.com.ceiba.daggerapplication.dependencyinjection.DaggerApplicationComponent;

public class DaggerApplication extends Application {

    ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
            .contextModule(new ContextModule(this))
            .build();

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
