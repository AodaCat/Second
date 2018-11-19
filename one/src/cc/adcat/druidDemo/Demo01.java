package cc.adcat.druidDemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo01 {
    public static void main(String[] args) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb1");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");

        Connection connection = PoolsUtil.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE id != ?");
            preparedStatement.setInt(1,1);
            resultSet = preparedStatement.executeQuery();
            connection.commit();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                int age = resultSet.getInt("age");
                System.out.println(id + "\t" + name + "\t" + city + "\t" + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            PoolsUtil.release(resultSet, preparedStatement, connection);
        }

    }
}
