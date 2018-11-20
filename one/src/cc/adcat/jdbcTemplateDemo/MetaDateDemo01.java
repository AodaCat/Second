package cc.adcat.jdbcTemplateDemo;

import cc.adcat.druidDemo.PoolsUtil;

import java.sql.*;

public class MetaDateDemo01 {
    public static void main(String[] args) throws SQLException {
        String sql = "select * from book";
        Connection connection = PoolsUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = preparedStatement.getMetaData();
        ResultSetMetaData metaData1 = resultSet.getMetaData();
        System.out.println("metaData = " + metaData.toString());
        System.out.println("metaData1 = " + metaData1.toString());
        System.out.println(metaData.equals(metaData1));


        System.out.println(metaData.getColumnCount());
        System.out.println(metaData.getColumnName(1));
        System.out.println(metaData.getColumnClassName(1));
        System.out.println(metaData.getTableName(1));
        System.out.println(metaData.getCatalogName(1));
        System.out.println(metaData.getColumnType(1));
        System.out.println(metaData.getColumnTypeName(1));

    }

    public static void test() throws SQLException {
        String sql = "insert into book values(?, ?, ?, ?)";
        Connection connection = PoolsUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
        int parameterCount = parameterMetaData.getParameterCount();
        System.out.println("parameterCount = " + parameterCount);
    }
}
