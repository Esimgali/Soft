import Decorator.CarInterior;
import Decorator.ImprovedAudioSystem;
import Decorator.Interior;
import Decorator.Tinting;

public class Main {
    public static void main(String[] args) {
        CarInterior inter = new Interior(500, "Default mers interior");
        inter = new Tinting(inter,100,"" );
        inter = new ImprovedAudioSystem(inter, 900, "Bose");
        Cars bmw = new Cars(new GasolineEngine(), new DiscBrakes(), inter);
        System.out.println(bmw.decor.getDescription());
        System.out.println(bmw.decor.cost());

    }
}