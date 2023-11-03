package ObserverFactory;

public class SentEmail extends SentNotification{
    @Override
    public void sentMassage(String username, String phoneNumber, String type) {
        System.out.println("send a message to the user " + username + " via email");
    }
}
