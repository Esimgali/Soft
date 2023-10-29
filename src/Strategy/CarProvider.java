package Strategy;

public interface CarProvider {
    int getEngineHorsepower();
    double getBrakesRadius();
    double getMaximumMileage();
    void notifyClients();
}
