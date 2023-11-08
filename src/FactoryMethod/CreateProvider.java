package FactoryMethod;

import Decorator.CarInterior;
import Strategy.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class CreateProvider{
    public CarProvider createProvider(IEngineStrategy engine, IBrakesStrategy brakes, CarInterior inter, String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        switch (type) {
            case ("tesla"):
                return new ProviderTesla(engine, brakes, inter);
            case ("volvo"):
                return new ProviderVolvo(engine, brakes, inter);
            case ("mercedes"):
                return new ProviderMercedes(engine, brakes, inter);
            case ("bmw"):
                return new ProviderBMW(engine, brakes, inter);
            default:
                throw new IllegalArgumentException("Unsupported car provider");
        }
    }
}