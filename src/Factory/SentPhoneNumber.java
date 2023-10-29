package Factory;

public class SentPhoneNumber extends SentNotification{
    @Override
    public void sentMassage(String username) {
        System.out.println("send a message to the user " + username + " via phone number");

    }

}
