package co.com.ceiba.daggerapplication;

import android.content.Context;

import javax.inject.Inject;

public class UserRepositoryImpl implements UserRepository {

    private final Context context;

    @Inject
    public UserRepositoryImpl(Context context) {
        this.context = context;
    }

    @Override
    public boolean isCreated(String id) {
        return true;
    }

    @Override
    public void save(User user) {

    }
}
