package singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class SingletonDemo {
    public static void main(String[] args) {
        ExampleDBSingleton dbSingleton = ExampleDBSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();
        Connection connection = dbSingleton.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);


        Statement statement;
        try {
            statement = connection.createStatement();
            int count = statement.executeUpdate("CREATE TABLE address(id INT, street_name VARCHAR (20))");
            System.out.println("Table Created");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        connection = dbSingleton.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }
}
