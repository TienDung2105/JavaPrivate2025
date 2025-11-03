import model.User;
import service.AuthService;
import service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        AuthService authService = new AuthService(userServiceUsers(userService));

        while (true) {
            System.out.println("\n=== MENU AUTH ===");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    if (authService.login(sc)) {
                        int option;
                        do {
                            System.out.println("\n--- MENU USER  ---");
                            System.out.println("1. Get user by is");
                            System.out.println("2. get all user");
                            System.out.println("3. Change password");
                            System.out.println("4. Đăng xuất");
                            System.out.print("Chọn: ");
                            option = Integer.parseInt(sc.nextLine());

                            switch (option) {
                                case 1:
                                    System.out.print("Nhập ID cần tìm: ");
                                    String id = sc.nextLine();
                                    userService.getUserById(id);
                                    break;
                                case 2:
                                    userService.getAllUsers();
                                    break;
                                case 3:
                                    authService.changePassword(sc);
                                    break;
                            }
                        } while (option != 4);
                    }
                    break;
                case 2:
                    authService.register(sc);
                    break;
                case 3:
                    System.out.println("Tạm biệt!");
                    return;
            }
        }
    }
    private static java.util.ArrayList<User> userServiceUsers(UserService userService) {
        try {
            java.lang.reflect.Field field = userService.getClass().getDeclaredField("users");
            field.setAccessible(true);
            return (java.util.ArrayList<User>) field.get(userService);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
