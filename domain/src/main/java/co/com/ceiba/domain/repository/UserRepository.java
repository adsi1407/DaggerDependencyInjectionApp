package co.com.ceiba.domain.repository;

import co.com.ceiba.domain.model.User;

public interface UserRepository {

    boolean isCreated(String id);

    void save(User user);
}
