package ObserverFactory;

public interface PublisherCar {
    public void unsubscribe(String name);

    void subscribe(String name);

    public void notifyClients();
}
