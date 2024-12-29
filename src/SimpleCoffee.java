public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "Просто кофе";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
