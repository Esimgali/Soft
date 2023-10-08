import Decorator.CarInterior;
import Decorator.Interior;

public class Cars{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    CarInterior decor;
    Cars(IEngineStrategy engine, IBrakesStrategy brakes, CarInterior decor){
        this.engine = engine;
        this.brakes = brakes;
        this.decor = decor;
    }

    String getEngine(){
        return engine.engine();
    }
}
