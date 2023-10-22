package Strategy;

public class GasEngine implements IEngineStrategy {
    int horsepower;
    double maximumMileage;
    GasEngine(int horsepower, double maximumMileage){
        this.horsepower = horsepower;
        this.maximumMileage = maximumMileage;
    }

    @Override
    public String engine() {
        return null;
    }
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public double getMaximumMileage() {
        return maximumMileage;
    }
}
