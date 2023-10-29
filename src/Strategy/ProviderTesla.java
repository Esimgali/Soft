package Strategy;

import DataBase.Database;
import Factory.SentEmail;
import Factory.SentNotification;
import Factory.SentPhoneNumber;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProviderTesla implements CarProvider{
    Database base = new Database();
    IEngineStrategy engine;
    IBrakesStrategy brakes;
    public ProviderTesla(IEngineStrategy engine, IBrakesStrategy brakes) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.brakes = brakes;
        this.engine = engine;
        notifyClients();
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
    public void notifyClients(){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                String[] subscribes = users.getString(6).split(", ");
                for(String sub : subscribes){
                    if(sub.contains("tesla")){
                        SentNotification sent;
                        if(users.getString(7).equals("phoneNumber")){
                            sent = new SentPhoneNumber();
                        }
                        else{
                            sent = new SentEmail();
                        }
                        sent.sentMassage( users.getString(1));
                        break;
                    }
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
