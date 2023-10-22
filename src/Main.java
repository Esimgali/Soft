import Adapter.AdapterProviderTesla;
import Decorator.CarInterior;
import Decorator.ImprovedAudioSystem;
import Decorator.Interior;
import Decorator.Tinting;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        CarInterior inter = new Interior(500, "Default mers interior");
        inter = new Tinting(inter,100,"" );
        inter = new ImprovedAudioSystem(inter, 900, "Bose");
        ProviderVolvo volvo = new ProviderVolvo(new DieselEngine(350, 1500),new DiscBrakes(15));
        ProviderTesla tesla = new ProviderTesla(new ElectricMotor(250, 1200), new DiscBrakes(4));
        AdapterProviderTesla adaptedTesla = new AdapterProviderTesla(tesla);
        Cars teslaAdapted = new Cars(new ElectricMotor(adaptedTesla.getEngineHorsepower(), adaptedTesla.getMaximumMileage()),new DiscBrakes(adaptedTesla.getBrakesRadius()), inter);
        System.out.println(teslaAdapted.getMaximumMileage());
    }
}