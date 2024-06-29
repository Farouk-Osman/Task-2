public class CheeseBurger implements Sandwich {
    @Override
    public String getDescription() {
        return "Cheese Burger";
    }

    @Override
    public double getCost() {
        return 75.0;
    }
}