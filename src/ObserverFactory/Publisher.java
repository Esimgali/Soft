package ObserverFactory;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Publisher {
    String username;
    String type;
    PublisherCar car;

    public Publisher(){}
    public void subscribe(String username, String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        switch (type){
            case ("tesla"):
                car = new PublisherTesla();
            case ("volvo"):
                car = new PublisherVolvo();
            case ("mercedes"):
                car = new PublisherMercedes();
            case ("bmw"):
                car = new PublisherBMW();
        }
        car.subscribe(username);
    }
    public void unsubscribe(String username, String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        switch (type){
            case ("tesla"):
                car = new PublisherTesla();
            case ("volvo"):
                car = new PublisherVolvo();
            case ("mercedes"):
                car = new PublisherMercedes();
            case ("bmw"):
                car = new PublisherBMW();
        }
        car.unsubscribe(username);
    }
}
