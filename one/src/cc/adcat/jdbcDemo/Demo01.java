package cc.adcat.jdbcDemo;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "root");
        String sql = "SELECT * FROM student WHERE id != ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,1);
        boolean execute = preparedStatement.execute();
        if (execute) {
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println(id + " " + name + " " + age);
            }
            resultSet.close();
        } else {
            int updateCount = preparedStatement.getUpdateCount();
            System.out.println("updateCount = " + updateCount);
        }
        preparedStatement.close();
        connection.close();

    }
}
