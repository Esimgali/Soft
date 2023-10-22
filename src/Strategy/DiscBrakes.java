package Strategy;

public class DiscBrakes implements IBrakesStrategy {
    double radius;
    public DiscBrakes(double radius){
        this.radius = radius;
    }
    @Override
    public String brakes(){
        return null;
    }

    @Override
    public double getBrakesRadius() {
        return radius;
    }
}
