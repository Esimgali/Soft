package User;

import Sign_up.Sign_up;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class User {
    String username;
    Sign_up signUp;
    public User(String username, String usersurname, String useremail, String userphonenumber, String shippingmethod) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException
    {
        this.username = username;
        signUp = new Sign_up();
        signUp.addNewUser(username, usersurname, useremail, userphonenumber, shippingmethod);
    }
//    public void createUser() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        signUp = new Sign_up();
//        signUp.addNewUser(username, usersurname, useremail, userphonenumber, shippingmethod);
//    }

}
