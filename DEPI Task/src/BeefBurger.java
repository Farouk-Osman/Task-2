public class BeefBurger implements Sandwich {
    @Override
    public String getDescription() {
        return "Beef Burger";
    }

    @Override
    public double getCost() {
        return 80.0;
    }
}