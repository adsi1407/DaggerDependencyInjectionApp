package co.com.ceiba.daggerapplication;

import android.app.Application;

public class DaggerApplication extends Application {

    ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
            .contextModule(new ContextModule(this))
            .build();

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
