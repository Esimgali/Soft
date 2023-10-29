import Adapter.AdapterProviderTesla;
import Decorator.CarInterior;
import Decorator.ImprovedAudioSystem;
import Decorator.Interior;
import Decorator.Tinting;
import Strategy.*;
import User.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User();
        RootUser root = new RootUser();
        CarInterior inter = new Interior(500, "Default mers interior");
        inter = new Tinting(inter,100,"" );
        inter = new ImprovedAudioSystem(inter, 900, "Bose");
        ProviderVolvo volvo = new ProviderVolvo(new DieselEngine(350, 1500),new DiscBrakes(15));
        ProviderTesla tesla = new ProviderTesla(new ElectricMotor(250, 1200), new DiscBrakes(4));
        AdapterProviderTesla adaptedTesla = new AdapterProviderTesla(tesla); }
}