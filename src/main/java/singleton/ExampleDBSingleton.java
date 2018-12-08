package singleton;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by maheraj on 12/8/18.
 */
public class ExampleDBSingleton implements Serializable {

    private static volatile ExampleDBSingleton instance;
    private static volatile Connection connection;

    private ExampleDBSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            throw new RuntimeException("Use getConnection() to create");
        }

        if (instance != null) {
            throw new RuntimeException("Use getInstance() to create");
        }
    }

    public static ExampleDBSingleton getInstance() {
        if (instance == null) {
            synchronized (ExampleDBSingleton.class) {
                if (instance == null) {
                    instance = new ExampleDBSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            synchronized (ExampleDBSingleton.class) {
                if (connection == null) {
                    String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
                    try {
                        connection = DriverManager.getConnection(dbURL);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }


    protected Object readResolve() {
        return getInstance();
    }
}
