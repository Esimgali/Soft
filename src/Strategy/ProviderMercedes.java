package Strategy;

import Decorator.CarInterior;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ProviderMercedes implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    CarInterior inter;
    public ProviderMercedes(IEngineStrategy engine, IBrakesStrategy brakes, CarInterior inter) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        this.inter = inter;
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
