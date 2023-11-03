package Strategy;

import Decorator.CarInterior;
import ObserverFactory.PublisherBMW;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ProviderBMW implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    PublisherBMW bmw;
    CarInterior inter;
    public ProviderBMW(IEngineStrategy engine, IBrakesStrategy brakes, CarInterior inter) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        this.inter = inter;
        this.bmw = new PublisherBMW();
        bmw.notifyClients(getBrakesRadius(), getEngineHorsepower(), getMaximumMileage(), getDescription());
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
    public  String getDescription(){
        return inter.getDescription();
    };
}
