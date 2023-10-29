package Factory;

public class SentEmail extends SentNotification{
    @Override
    public void sentMassage(String username) {
        System.out.println("send a message to the user " + username + " via email");
    }
}
