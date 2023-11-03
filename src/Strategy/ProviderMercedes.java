package Strategy;

import DataBase.Database;
import ObserverFactory.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ProviderMercedes implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    PublisherMercedes mercedes;
    public ProviderMercedes(IEngineStrategy engine, IBrakesStrategy brakes) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        this.mercedes = new PublisherMercedes();
        mercedes.notifyClients();
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
    Database base = new Database();

}
