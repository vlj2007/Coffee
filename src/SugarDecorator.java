public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + ", сахар";
    }

    @Override
    public double cost(){
        return decoratedCoffee.cost() + 0.20;
    }
}
