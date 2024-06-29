public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich decoratedSandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.decoratedSandwich = sandwich;
    }

    public String getDescription() {
        return decoratedSandwich.getDescription();
    }

    public double getCost() {
        return decoratedSandwich.getCost();
    }
}
