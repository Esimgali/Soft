package Adapter;

import Strategy.CarProvider;
import Strategy.ProviderTesla;

public class AdapterProviderTesla implements CarProvider {
    ProviderTesla tesla;
    public AdapterProviderTesla(ProviderTesla tesla){
        this.tesla = tesla;
    }
    @Override
    public double getBrakesRadius() {
        return tesla.getBrakesRadius() * 2.54;
    }

    @Override
    public int getEngineHorsepower() {
        return tesla.getEngineHorsepower();
    }

    @Override
    public double getMaximumMileage() {
        return tesla.getMaximumMileage() * 1.6;
    }
    @Override
    public String getDescription(){
        return tesla.getDescription();
    }
}
