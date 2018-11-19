package cc.adcat.c3p0Demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Demo01 {
    public static void main(String[] args) throws Exception {

//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mydb1");
//        dataSource.setUser("root");
//        dataSource.setPassword("root");


        Connection connection = PoolsUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE id = ?");
        preparedStatement.setInt(1,1);
        preparedStatement.execute();
        ResultSet rs = preparedStatement.getResultSet();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String city = rs.getString("city");
            int age = rs.getInt("age");
            System.out.println(id + "\t" + name + "\t" + city + "\t" + age);
        }

        PoolsUtil.release(rs, preparedStatement, connection);
    }
}
