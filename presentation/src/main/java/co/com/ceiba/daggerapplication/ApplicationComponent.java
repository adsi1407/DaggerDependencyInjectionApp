package co.com.ceiba.daggerapplication;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = { UserDIModule.class, ContextModule.class})
@Singleton
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
}
