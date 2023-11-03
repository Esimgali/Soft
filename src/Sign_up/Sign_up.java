package Sign_up;

import DataBase.Database;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sign_up {

    public void addNewUser(String username, String usersurname, String useremail, String userphonenumber, String shippingmethod) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Database base = new Database();
        int maxId = 0;
        try (ResultSet last_id = base.statement.executeQuery("SELECT max(userid) FROM users")) {
            if (last_id.next()) {
                maxId = last_id.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement preparedStatement = base.connection.prepareStatement("INSERT INTO users (userid, username, usersurname, useremail, userphonenumber, shippingmethod)" +
                " values (?,?,?,?,?,?)");
        preparedStatement.setInt(1, maxId + 1);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, usersurname);
        preparedStatement.setString(4, useremail);
        preparedStatement.setString(5, userphonenumber);
        preparedStatement.setString(6, shippingmethod);
        preparedStatement.executeUpdate();
    }
}
