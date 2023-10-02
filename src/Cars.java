public class Cars {
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    Cars(IEngineStrategy engine, IBrakesStrategy brakes){
        this.engine = engine;
        this.brakes = brakes;
    }
}
