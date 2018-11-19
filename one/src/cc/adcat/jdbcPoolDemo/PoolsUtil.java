package cc.adcat.jdbcPoolDemo;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class PoolsUtil {
    private static String DRIVER_CLASS_NAME;
    private static String DATA_PATH;
    private static String USERNAME;
    private static String PASSWORD;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("one/jdbc.properties"));
            DRIVER_CLASS_NAME = properties.getProperty("DRIVER_CLASS_NAME");
            DATA_PATH = properties.getProperty("DATA_PATH");
            USERNAME = properties.getProperty("USERNAME");
            PASSWORD = properties.getProperty("PASSWORD");
            Class.forName(DRIVER_CLASS_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATA_PATH, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resultSet = null;
        }

        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement = null;
        }

        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection = null;
        }
    }

}
