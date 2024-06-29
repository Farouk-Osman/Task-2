public class TomatoDecorator extends SandwichDecorator {
    public TomatoDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return decoratedSandwich.getCost() + 5.0;
    }
}
