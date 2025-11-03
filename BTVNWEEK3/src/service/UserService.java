package service;

import model.User;
import java.util.ArrayList;


public class UserService {
    private ArrayList<User> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User("U01", "Dung", "123", "dung@gmail.com", "0123456789"));
        users.add(new User("U02", "Bao", "111", "bao@gmail.com", "0987654321"));
        users.add(new User("U03", "Dat", "222", "dat@gmail.com", "0909090909"));
        users.add(new User("U04", "Hoang", "333", "hoanng@gmail.com", "0911222333"));
        users.add(new User("U05", "Dai", "444", "dai@gmail.com", "0933444555"));
    }

    public UserService(ArrayList<User> users) {
        this.users = users;
    }

    public void getUserById(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                System.out.println(u);
                return;
            }
        }
        System.out.println("Khong tim thay nguoi dung co ID: " + id);
    }

    public void getAllUsers() {
        System.out.println("---Danh sach nguoi dung---");
        for (User u : users) {
            System.out.println(u);
        }
    }
}
