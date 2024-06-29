import java.util.ArrayList;
import java.util.List;

public class Addition {
    private List<AdditionItem> additions = new ArrayList<>();

    public void addAddition(AdditionItem addition) {
        additions.add(addition);
    }

    public List<AdditionItem> getAdditions() {
        return additions;
    }

    public AdditionItem getAdditionById(int id) {
        return additions.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}
