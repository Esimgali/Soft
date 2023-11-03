package Strategy;

import DataBase.Database;
import ObserverFactory.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ProviderVolvo implements CarProvider{
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    PublisherVolvo volvo;
    public ProviderVolvo(IEngineStrategy engine, IBrakesStrategy brakes) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        this.volvo = new PublisherVolvo();
        volvo.notifyClients();
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
