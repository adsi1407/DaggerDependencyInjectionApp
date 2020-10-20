package co.com.ceiba.daggerapplication.dependencyinjection;

import co.com.ceiba.dataaccess.repository.UserRepositoryImpl;
import co.com.ceiba.domain.repository.UserRepository;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class UserDIModule {

    @Binds
    public abstract UserRepository bindUserRepository(UserRepositoryImpl userRepository);
}
