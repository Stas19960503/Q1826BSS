package lesson7;

import java.util.*;

public class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    public List<User> findByName(String name) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> findByGender(String gender) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getGender().equalsIgnoreCase(gender)) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> getSortedByAge() {
        List<User> sorted = new ArrayList<>(users);
        Collections.sort(sorted);
        return sorted;
    }

    public void setUsers(Collection<User> newUsers) {
        this.users = new ArrayList<>(newUsers);
    }

    public List<User> getUsers() {
        return users;
    }
}
