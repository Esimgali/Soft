package Strategy;

public class DrumBrakes implements IBrakesStrategy {
    double radius;
    DrumBrakes(double radius){
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
