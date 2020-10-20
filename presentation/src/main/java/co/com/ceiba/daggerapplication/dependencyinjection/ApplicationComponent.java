package co.com.ceiba.daggerapplication.dependencyinjection;

import javax.inject.Singleton;

import co.com.ceiba.daggerapplication.MainActivity;
import dagger.Component;

@Component(modules = { UserDIModule.class, ContextModule.class})
@Singleton
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
}
