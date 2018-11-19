package cc.adcat.jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo02 {
    public static void main(String[] args) {
        Connection connection = Util.getConnection();
        String sql = "SELECT * FROM student WHERE city = ? AND age = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "北京");
            preparedStatement.setInt(2, 20);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                int age = resultSet.getInt("age");
                System.out.println(id + "\t" + name + "\t" + city + "\t" + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Util.release(resultSet, preparedStatement, connection);
        }

    }
}
