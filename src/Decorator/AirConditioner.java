package Decorator;

public class AirConditioner implements CarInterior{
    CarInterior decor;
    private String description = ", air conditioner";
    private int cost;
    public AirConditioner(CarInterior decor, int cost, String description){
        this.decor = decor;
        this.description += description != "" ? "(" + description + ")":"";
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return decor.getDescription() + description;
    }

    @Override
    public int cost() {
        return decor.cost() + cost;
    }
}
