package co.com.ceiba.daggerapplication;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class UserDIModule {

    @Binds
    public abstract UserRepository bindUserRepository(UserRepositoryImpl userRepository);
}
