import java.util.Scanner;

public class UserMain {
    private Menu menu = Menu.getInstance();
    private Addition addition = new Addition();
    private Scanner scanner = new Scanner(System.in);

    public UserMain() {
        // Initialize additions with some default items
        addition.addAddition(new AdditionItem("Ketchup", 5.0));
        addition.addAddition(new AdditionItem("Mayonnaise", 10.0));
        addition.addAddition(new AdditionItem("Tomato", 5.0));
        addition.addAddition(new AdditionItem("Cheese", 15.0));
    }

    public void run() {
        showMenu();
        takeOrder();
    }

    public void showMenu() {
        System.out.println("Welcome to our restaurant");
        System.out.println("Menu:");
        for (SandwichItem sandwich : menu.getSandwiches()) {
            System.out.println(sandwich.getId() + "- " + sandwich.getName() + " (" + sandwich.getPrice() + ")");
        }
    }

    public void takeOrder() {
        System.out.println("Please select option:");
        int option = scanner.nextInt();
        Sandwich sandwich = null;

        SandwichItem selectedSandwich = menu.getSandwichById(option);
        if (selectedSandwich != null) {
            switch (selectedSandwich.getName()) {
                case "Beef Burger":
                    sandwich = new BeefBurger();
                    break;
                case "Chicken Burger":
                    sandwich = new ChickenBurger();
                    break;
                case "Cheese Burger":
                    sandwich = new CheeseBurger();
                    break;
                default:
                    System.out.println("Invalid option");
                    return;
            }
        } else {
            System.out.println("Invalid option");
            return;
        }

        System.out.println("Do you like to add any additions? (1- Yes, 2- No)");
        int addOption = scanner.nextInt();

        if (addOption == 1) {
            showAdditions();
            scanner.nextLine(); // Consume newline
            String additionsInput = scanner.nextLine();
            String[] additionsArray = additionsInput.split(", ");
            for (String add : additionsArray) {
                int addId = Integer.parseInt(add);
                AdditionItem selectedAddition = addition.getAdditionById(addId);
                if (selectedAddition != null) {
                    switch (selectedAddition.getName()) {
                        case "Ketchup":
                            sandwich = new KetchupDecorator(sandwich);
                            break;
                        case "Mayonnaise":
                            sandwich = new MayonnaiseDecorator(sandwich);
                            break;
                        case "Tomato":
                            sandwich = new TomatoDecorator(sandwich);
                            break;
                        case "Cheese":
                            sandwich = new CheeseDecorator(sandwich);
                            break;
                        default:
                            System.out.println("Invalid addition");
                            break;
                    }
                } else {
                    System.out.println("Invalid addition");
                }
            }
        }

        confirmOrder(sandwich);
    }

    public void showAdditions() {
        System.out.println("Additions:");
        for (AdditionItem additionItem : addition.getAdditions()) {
            System.out.println(additionItem.getId() + "- " + additionItem.getName() + " (" + additionItem.getPrice() + ")");
        }
        System.out.println("Please select options (like 1, 2):");
    }

    public void confirmOrder(Sandwich sandwich) {
        System.out.println("Your order is: " + sandwich.getDescription());
        System.out.println("Total: " + sandwich.getCost());
        System.out.println("1- Confirm");
        System.out.println("2- Back to Menu");

        int confirmOption = scanner.nextInt();
        if (confirmOption == 1) {
            Receipt receipt = new Receipt();
            receipt.printReceipt(sandwich);
        } else {
            showMenu();
            takeOrder();
        }
    }
}
