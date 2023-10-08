package Decorator;

public class LeatherInterior implements CarInterior{
    CarInterior decor;
    private String description = ", leather interior";
    private int cost;
    public LeatherInterior(CarInterior decor, int cost, String description){
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
