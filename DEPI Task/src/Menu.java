import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<SandwichItem> sandwiches = new ArrayList<>();

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
