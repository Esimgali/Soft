package Strategy;

import Decorator.CarInterior;
import Decorator.Interior;
import ObserverFactory.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Cars{
    CarProvider carProvider;
    PublisherCar publisher;
    String type;
    public Cars(CarProvider carProvider, String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.type = type;
        this.carProvider = carProvider;
        notify(type);
    }
    public void notify(String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        switch (type){
            case "tesla":
                publisher = new PublisherTesla();
                break;
            case "bmw":
                publisher = new PublisherBMW();
                break;
            case "mercedes" :
                publisher = new PublisherMercedes();
                break;
            case "volvo" :
                publisher = new PublisherVolvo();
                break;
        }
        publisher.notifyClients(carProvider.getBrakesRadius(),carProvider.getEngineHorsepower(),
                carProvider.getMaximumMileage(), carProvider.getDescription());
    }
}
