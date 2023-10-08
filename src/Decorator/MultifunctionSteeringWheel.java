package Decorator;

public class MultifunctionSteeringWheel implements CarInterior{
    CarInterior decor;
    private String description = ", multifunction steering wheel";
    private int cost;
    public MultifunctionSteeringWheel(CarInterior decor, int cost, String description){
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
