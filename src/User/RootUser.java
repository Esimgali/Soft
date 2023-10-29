package User;

import DataBase.Database;
import Factory.SentEmail;
import Factory.SentNotification;
import Factory.SentPhoneNumber;
import Strategy.Cars;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RootUser {
    public RootUser() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {}
    public void subscribe(String provider, String name){

    }
    public void unsubscribe(String provider, String name){

    }
}
