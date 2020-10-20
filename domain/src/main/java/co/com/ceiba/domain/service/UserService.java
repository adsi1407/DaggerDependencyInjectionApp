package co.com.ceiba.domain.service;

import javax.inject.Inject;

import co.com.ceiba.domain.model.User;
import co.com.ceiba.domain.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isCreated(String id) {
        return userRepository.isCreated(id);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
