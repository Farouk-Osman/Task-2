import java.util.Scanner;

public class AdminMain {
    private Menu menu = new Menu();
    private Addition addition = new Addition();
    private Scanner scanner = new Scanner(System.in);

    public AdminMain() {

        menu.addSandwich(new SandwichItem("Beef Burger", 80.0));
        menu.addSandwich(new SandwichItem("Chicken Burger", 70.0));
        menu.addSandwich(new SandwichItem("Cheese Burger", 75.0));

        addition.addAddition(new AdditionItem("Ketchup", 5.0));
        addition.addAddition(new AdditionItem("Mayonnaise", 10.0));
        addition.addAddition(new AdditionItem("Tomato", 5.0));
        addition.addAddition(new AdditionItem("Cheese", 15.0));
    }

    public void run() {
        while (true) {
            showAdminMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    viewAdditions();
                    break;
                case 3:
                    addNewSandwich();
                    break;
                case 4:
                    addNewAddition();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public void showAdminMenu() {
        System.out.println("1- View Menu");
        System.out.println("2- View Additions");
        System.out.println("3- Add New Item to Menu");
        System.out.println("4- Add New Addition");
    }

    public void viewMenu() {
        System.out.println("Menu:");
        for (SandwichItem sandwich : menu.getSandwiches()) {
            System.out.println(sandwich.getId() + "- " + sandwich.getName() + " (" + sandwich.getPrice() + ")");
        }
    }

    public void viewAdditions() {
        System.out.println("Additions:");
        for (AdditionItem additionItem : addition.getAdditions()) {
            System.out.println(additionItem.getId() + "- " + additionItem.getName() + " (" + additionItem.getPrice() + ")");
        }
    }

    public void addNewSandwich() {
        System.out.println("New Sandwich:");
        scanner.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        SandwichItem newSandwich = new SandwichItem(name, price);
        menu.addSandwich(newSandwich);
    }

    public void addNewAddition() {
        System.out.println("New Addition:");
        scanner.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        AdditionItem newAddition = new AdditionItem(name, price);
        addition.addAddition(newAddition);
    }
}
