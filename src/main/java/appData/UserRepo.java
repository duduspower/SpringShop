package appData;

import java.util.List;

public interface UserRepo {
    List<User> findAll();
    User findById(int ID);
    User save(User user);
    void deleteAll();
    void deleteById(int ID);
}
