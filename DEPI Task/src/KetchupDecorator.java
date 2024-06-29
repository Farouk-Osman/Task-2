public class KetchupDecorator extends SandwichDecorator {
    public KetchupDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", Ketchup";
    }

    @Override
    public double getCost() {
        return decoratedSandwich.getCost() + 5.0;
    }
}



