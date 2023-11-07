package User;

import DataBase.Database;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RootUser {
    Database base = new Database();

    private static RootUser instance;

    private RootUser() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    public static RootUser getInstance() throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        if (instance == null) {
            instance = new RootUser();
        }
        return instance;
    }

    public void deleteUser(int userId) {
        try {
            Statement statement = base.connection.createStatement();
            statement.executeUpdate("DELETE FROM users WHERE userid = " + userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getUsers(){
        try (ResultSet users = base.statement.executeQuery("SELECT * FROM users")) {
            while (users.next()) {
                System.out.println(users.getString(2) + ": " + users.getString(1) + ", " + users.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
