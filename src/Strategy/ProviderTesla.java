package Strategy;

public class ProviderTesla implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    public ProviderTesla(IEngineStrategy engine, IBrakesStrategy brakes){
        this.brakes = brakes;
        this.engine = engine;
    }
    @Override
    public double getBrakesRadius() {
        return brakes.getBrakesRadius();
    }

    @Override
    public int getEngineHorsepower() {
        return engine.getHorsepower();
    }

    @Override
    public double getMaximumMileage() {
        return engine.getMaximumMileage();
    }
}
