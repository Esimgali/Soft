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
                break;
            case ("volvo"):
                car = new PublisherVolvo();
                break;
            case ("mercedes"):
                car = new PublisherMercedes();
                break;
            case ("bmw"):
                car = new PublisherBMW();
                break;
        }
        car.subscribe(username);
    }
    public void unsubscribe(String username, String type) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        switch (type){
            case ("tesla"):
                car = new PublisherTesla();
                break;
            case ("volvo"):
                car = new PublisherVolvo();
                break;
            case ("mercedes"):
                car = new PublisherMercedes();
                break;
            case ("bmw"):
                car = new PublisherBMW();
                break;
        }
        car.unsubscribe(username);
    }
}
