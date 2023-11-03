package Strategy;

import ObserverFactory.PublisherBMW;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ProviderBMW implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    PublisherBMW bmw;
    public ProviderBMW(IEngineStrategy engine, IBrakesStrategy brakes) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        this.bmw = new PublisherBMW();
        bmw.notifyClients();
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
