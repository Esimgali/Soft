import Adapter.AdapterProviderTesla;
import Decorator.*;
import FactoryMethod.CreateProvider;
import ObserverFactory.Publisher;
import Strategy.*;
import User.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CarInterior inter = new Interior(25, "default tesla");
        inter = new Tinting(inter, 54, "");
        inter = new MultifunctionSteeringWheel(inter, 45, "");
        inter = new ImprovedAudioSystem(inter, 89, "bosh");
        CreateProvider creator = new CreateProvider();
        CarProvider tesla =  creator.createProvider(new ElectricMotor(250, 1200), new DiscBrakes(4), inter, "tesla");
        AdapterProviderTesla adaptedTesla = new AdapterProviderTesla(tesla);
        Cars newTesla = new Cars(adaptedTesla, "tesla");
        RootUser rootUser = RootUser.getInstance();
        //User user = new User("Esimgali", "Khamitov", "esimgali@gamil.com","82568989", "phone");
        Publisher pb = new Publisher();
//        pb.subscribe("Esimgali", "tesla");
    }
}