import Adapter.AdapterProviderTesla;
import Decorator.CarInterior;
import Decorator.ImprovedAudioSystem;
import Decorator.Interior;
import Decorator.Tinting;
import ObserverFactory.Publisher;
import Strategy.*;
import User.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

//        ProviderTesla tesla = new ProviderTesla(new ElectricMotor(250, 1200), new DiscBrakes(4), inter);
//        AdapterProviderTesla adaptedTesla = new AdapterProviderTesla(tesla);
//        RootUser rootUser = RootUser.getInstance();
        //User user = new User("Esimgali", "Khamitov", "esimgali@gamil.com","82568989", "phone");
        RootUser rootUser = RootUser.getInstance();
        Publisher pb = new Publisher();
        pb.unsubscribe("Esimgali", "volvo");
    }
}