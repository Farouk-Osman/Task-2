import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Menu instance;
    private List<SandwichItem> sandwiches = new ArrayList<>();

    private Menu() {
        // Initialize menu with some default items
        sandwiches.add(new SandwichItem("Beef Burger", 80.0));
        sandwiches.add(new SandwichItem("Chicken Burger", 70.0));
        sandwiches.add(new SandwichItem("Cheese Burger", 75.0));
    }

    public static synchronized Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public void addSandwich(SandwichItem sandwich) {
        sandwiches.add(sandwich);
    }

    public List<SandwichItem> getSandwiches() {
        return sandwiches;
    }

    public SandwichItem getSandwichById(int id) {
        return sandwiches.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
