package Decorator;

public class Tinting implements CarInterior{
    CarInterior decor;
    private String description = ", tinting";
    private int cost;
    public Tinting(CarInterior decor, int cost, String description){
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
