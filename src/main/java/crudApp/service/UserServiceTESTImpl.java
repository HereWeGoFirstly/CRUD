package crudApp.service;

import crudApp.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceTESTImpl implements UserService {
    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(0, "Mamut", "Casino"));
        userList.add(new User(1, "Denchik", "Falling"));
    }

    @Override
    public List<User> listUsers() {
        return userList;
    }

    @Override
    public User getUserById(int id) {
        return listUsers().get(id);
    }

    @Override
    public void add(User user) {
        user.setId(userList.size());
        userList.add(user);
    }

    @Override
    public void deleteById(int id) {
        userList.remove(id);
        recountId();
    }

    @Override
    public void update(int id, User updatedUser) {
        User updatingUser = getUserById(id);
        updatingUser.setName(updatedUser.getName());
        updatingUser.setSurname(updatedUser.getSurname());
    }

    public void recountId() {
        int i = 0;
        for (User user : userList) {
            user.setId(i++);
        }
    }

}
