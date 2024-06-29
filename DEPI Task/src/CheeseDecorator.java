public class CheeseDecorator extends SandwichDecorator {
    public CheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedSandwich.getCost() + 15.0;
    }
}
