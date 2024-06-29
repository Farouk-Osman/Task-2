public class MayonnaiseDecorator extends SandwichDecorator {
    public MayonnaiseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription() + ", Mayonnaise";
    }

    @Override
    public double getCost() {
        return decoratedSandwich.getCost() + 10.0;
    }
}
