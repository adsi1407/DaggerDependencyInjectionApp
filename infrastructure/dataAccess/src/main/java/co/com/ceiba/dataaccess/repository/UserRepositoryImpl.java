package co.com.ceiba.dataaccess.repository;

import android.content.Context;

import javax.inject.Inject;

import co.com.ceiba.domain.model.User;
import co.com.ceiba.domain.repository.UserRepository;

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
