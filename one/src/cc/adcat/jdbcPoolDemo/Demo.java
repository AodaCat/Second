package cc.adcat.jdbcPoolDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo {
    public static void main(String[] args) throws Exception{
        MyDataSourse myDataSourse = new MyDataSourse();
        Connection connection = myDataSourse.getConnection();
        String sql = "SELECT * FROM student WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 1);
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.getResultSet();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            int age = resultSet.getInt("age");
            System.out.println(id + "\t" + name + "\t" + city + "\t" + age);
        }
        resultSet.close();
        preparedStatement.close();
        myDataSourse.backToPool(connection);

    }
}
