public class ChickenBurger implements Sandwich {
    @Override
    public String getDescription() {
        return "Chicken Burger";
    }

    @Override
    public double getCost() {
        return 70.0;
    }
}