package service;

import model.User;
import java.util.HashMap;

public class UserService {
    private HashMap<String, User> users = new HashMap<>();

    public UserService() {
        users.put("student1", new User("student1", "pass123", "John Doe"));
    }

    public User login(String username, String password) {
        User u = users.get(username);
        return (u != null && u.getPassword().equals(password)) ? u : null;
    }

    public void updateProfile(User user, String newName, String newPassword) {
        user.setName(newName);
        user.setPassword(newPassword);
    }
}