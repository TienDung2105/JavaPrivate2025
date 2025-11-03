package service;

import model.User;
import java.util.ArrayList;
import java.util.Scanner;

public class AuthService {
    private ArrayList<User> users;
    public AuthService(ArrayList<User> users) {
        this.users = users;
    }
    public boolean login(Scanner sc) {
        System.out.print("Nhập username: ");
        String username = sc.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username)
                    && u.getPassword().equals(password)) {
                System.out.println("✅ Đăng nhập thành công! Xin chào " + u.getUsername());
                return true;
            }
        }
        System.out.println(" Sai tài khoản hoặc mật khẩu!");
        return false;
    }

    public void register(Scanner sc) {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập username: ");
        String username = sc.nextLine();
        System.out.print("Nhập password: ");
        String password = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        users.add(new User(id, username, password, email, phone));
        System.out.println("✅ Đăng ký thành công!");
    }

    public void changePassword(Scanner sc) {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        for (User u : users) {
            if (u.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập mật khẩu mới: ");
                String newPass = sc.nextLine();
                System.out.print("Xác nhận mật khẩu mới: ");
                String confirm = sc.nextLine();
                if (newPass.equals(confirm)) {
                    u.setPassword(newPass);
                    System.out.println(" Đổi mật khẩu thành công!");
                } else {
                    System.out.println(" Mật khẩu xác nhận không khớp!");
                }
                return;
            }
        }
        System.out.println(" Không tìm thấy người dùng!");
    }
}
