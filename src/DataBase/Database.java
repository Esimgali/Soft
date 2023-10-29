package DataBase;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public Connection connection;
    public Statement statement;

    public Database() throws ClassNotFoundException, SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class.forName("org.postgresql.Driver");
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/softPatterns", "postgres", "Werreac!69!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }
}
