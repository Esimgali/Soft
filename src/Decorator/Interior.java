package Decorator;

public class Interior implements CarInterior {
    private String description;
    private int cost;
    public Interior(int cost, String description){
        this.description = description;
        this.cost = cost;
    };

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
