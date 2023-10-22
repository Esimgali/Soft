package Strategy;

public class ProviderVolvo implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    public ProviderVolvo(IEngineStrategy engine, IBrakesStrategy brakes){
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
