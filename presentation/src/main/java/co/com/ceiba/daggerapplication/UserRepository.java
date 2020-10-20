package co.com.ceiba.daggerapplication;

public interface UserRepository {

    boolean isCreated(String id);

    void save(User user);
}
