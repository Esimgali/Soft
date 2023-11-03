package Strategy;

import DataBase.Database;
import ObserverFactory.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ProviderTesla implements CarProvider{
    Database base = new Database();
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    PublisherTesla tesla;
    public ProviderTesla(IEngineStrategy engine, IBrakesStrategy brakes) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        this.tesla = new PublisherTesla();
        tesla.notifyClients();
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
