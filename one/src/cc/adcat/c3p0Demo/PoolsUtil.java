package cc.adcat.c3p0Demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class PoolsUtil {
//    private static String DRIVER_CLASS_NAME;
//    private static String DATA_PATH;
//    private static String USERNAME;
//    private static String PASSWORD;
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

//    static {
//        try {
//            Properties properties = new Properties();
//            properties.load(new FileReader("one/jdbc.properties"));
//            DRIVER_CLASS_NAME = properties.getProperty("DRIVER_CLASS_NAME");
//            DATA_PATH = properties.getProperty("DATA_PATH");
//            USERNAME = properties.getProperty("USERNAME");
//            PASSWORD = properties.getProperty("PASSWORD");
//            dataSource.setDriverClass(DRIVER_CLASS_NAME);
//            dataSource.setJdbcUrl(DATA_PATH);
//            dataSource.setUser(USERNAME);
//            dataSource.setPassword(PASSWORD);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static Connection getConnection() {

        Connection connection = null;
        try {
            connection = dataSource.getConnection();
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
