package Strategy;

import Decorator.CarInterior;
import Decorator.Interior;

public class Cars{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    CarInterior decor;
    public Cars(IEngineStrategy engine, IBrakesStrategy brakes, CarInterior decor){
        this.engine = engine;
        this.brakes = brakes;
        this.decor = decor;

    }
    public String getEngine(){
        return engine.engine();
    }
    public double getBrakesRadius() {
        return brakes.getBrakesRadius();
    }


    public int getEngineHorsepower() {
        return engine.getHorsepower();
    }


    public double getMaximumMileage() {
        return engine.getMaximumMileage();
    }
}
