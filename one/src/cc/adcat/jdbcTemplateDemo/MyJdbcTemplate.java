package cc.adcat.jdbcTemplateDemo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyJdbcTemplate {
    private DataSource dataSource;

    public int update(String sql, Object... params) {
        int executeUpdate = 0;
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();

            for (int i = 0; i < parameterMetaData.getParameterCount(); i++) {
                preparedStatement.setObject(i+1,params[i]);
            }
            executeUpdate = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return executeUpdate;
    }

    public MyJdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
