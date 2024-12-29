public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decorateCoffee){
        super(decorateCoffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + ", молоко";
    }

    @Override
    public double cost(){
        return decoratedCoffee.cost() + 0.50;
    }

}
