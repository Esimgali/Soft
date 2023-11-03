package ObserverFactory;

import DataBase.Database;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PublisherMercedes implements PublisherCar{
    String username;
    public PublisherMercedes() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }
    Database base = new Database();
    @Override
    public void subscribe(String name){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                if(users.getString(6) !=null && users.getString(6).contains("mercedes")){
                    continue;
                }
                if (users.getString(1).equals(name)) {
                    String existingSubscribers = users.getString("usersubscribes");
                    PreparedStatement preparedStatement = null;

                    if (existingSubscribers == null) {
                        preparedStatement = base.connection.prepareStatement("UPDATE users SET usersubscribes = ? WHERE username = ?");
                        preparedStatement.setString(1, "mercedes");
                    } else {
                        String newSubscribers = existingSubscribers + ", mercedes";
                        preparedStatement = base.connection.prepareStatement("UPDATE users SET usersubscribes = ? WHERE username = ?");
                        preparedStatement.setString(1, newSubscribers);
                    }
                    preparedStatement.setString(2, name);
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void unsubscribe(String name){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                if (users.getString(1).equals(name) && users.getString(6).contains("mercedes") && users.getString(6) != null) {
                    String newSubscribers = null;
                    String existingSubscribers = users.getString("usersubscribes");
                    PreparedStatement preparedStatement = base.connection.prepareStatement("UPDATE users SET usersubscribes = ? WHERE username = ?");
                    if(existingSubscribers.contains(", ")){
                        String[] subscribers = existingSubscribers.split(", ");
                        if(subscribers[0].equals("mercedes")){
                            newSubscribers = subscribers[1];
                            for(int i = 2; i < subscribers.length; i++){
                                if(!subscribers[i].equals("mercedes")){
                                    newSubscribers += ", " + subscribers[i];
                                }
                            }
                        }
                        else {
                            newSubscribers = subscribers[0];
                            for(int i = 1; i < subscribers.length; i++){
                                if(!subscribers[i].equals("mercedes")){
                                    newSubscribers += ", " + subscribers[i];
                                }
                            }
                        }
                    }
                    preparedStatement.setString(1, newSubscribers);
                    preparedStatement.setString(2, name);
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void notifyClients(double brakesRadius, int engineHorsepower, double maximumMileage, String description){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                String[] subscribes;
                if(users.getString(6) != null){
                    continue;
                }
                else if(users.getString(6).contains(", ")){
                    subscribes = users.getString(6).split(", ");
                    for(String sub : subscribes){
                        if(sub.contains("mercedes")){
                            SentNotification sent;
                            if(users.getString(7).equals("phoneNumber")){
                                sent = new SentPhoneNumber();
                                sent.sentMassage(users.getString(1), users.getString(5), "Mercedes " + "brakesRadius: " + brakesRadius + "; engineHorsepower: " + engineHorsepower + "; maximumMileage: " + maximumMileage + "; description: " + description);
                            }
                            else{
                                sent = new SentEmail();
                                sent.sentMassage(users.getString(1), users.getString(4), "Mercedes " + "brakesRadius: " + brakesRadius + "; engineHorsepower: " + engineHorsepower + "; maximumMileage: " + maximumMileage + "; description: " + description);
                            }
                            break;
                        }
                    }
                }
                else{
                    String sub = users.getString(6);
                    if(sub.contains("mercedes")){
                        SentNotification sent;
                        if(users.getString(7).equals("phoneNumber")){
                            sent = new SentPhoneNumber();
                            sent.sentMassage(users.getString(1), users.getString(5), "Mercedes " + "brakesRadius: " + brakesRadius + "; engineHorsepower: " + engineHorsepower + "; maximumMileage: " + maximumMileage + "; description: " + description);
                        }
                        else{
                            sent = new SentEmail();
                            sent.sentMassage(users.getString(1), users.getString(4), "Mercedes " + "brakesRadius: " + brakesRadius + "; engineHorsepower: " + engineHorsepower + "; maximumMileage: " + maximumMileage + "; description: " + description);
                        }
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
