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
                if(users.getString(1).equals(name)){
                    PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT INTO users (usersubscribes)" +
                            " values (?)");
                    preparedStatement.setString(1, "tesla, ");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void unsubscribe(String name){

    }
    public void notifyClients(){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                String[] subscribes = users.getString(6).split(", ");
                for(String sub : subscribes){
                    if(sub.contains("tesla")){
                        SentNotification sent;
                        if(users.getString(7).equals("phoneNumber")){
                            sent = new SentPhoneNumber();
                            sent.sentMassage(users.getString(1), users.getString(5), "Mercedes");
                        }
                        else{
                            sent = new SentEmail();
                            sent.sentMassage(users.getString(1), users.getString(4), "Mercedes");
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
