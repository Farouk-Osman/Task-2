import java.util.*;
public class Main {
    public static void main(String[] args) {
        UserMain userMain = new UserMain();
        AdminMain adminMain = new AdminMain();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Burger-Masr :-\nWhich type of login do you want to use?");
            System.out.println("1- User");
            System.out.println("2- Admin");
            System.out.println("3- Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    userMain.run();
                    break;
                case 2:
                    adminMain.run();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
