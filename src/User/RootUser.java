package User;

import DataBase.Database;
import Factory.SentEmail;
import Factory.SentNotification;
import Factory.SentPhoneNumber;
import Strategy.Cars;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RootUser {
    Database base = new Database();
    public RootUser() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {}
    public void subscribe(String provider, String name){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                    if(users.getString(1).equals(name)){
                        PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT INTO users (usersubscribes)" +
                                " values (?)");
                        preparedStatement.setString(1, provider);
                    }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void unsubscribe(String provider, String name){

    }
}
