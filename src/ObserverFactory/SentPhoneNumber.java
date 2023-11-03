package ObserverFactory;

public class SentPhoneNumber extends SentNotification{
    @Override
    public void sentMassage(String username, String phoneNumber, String type) {
        System.out.println("send a message to the user " + username + " via phone number");

    }

}
