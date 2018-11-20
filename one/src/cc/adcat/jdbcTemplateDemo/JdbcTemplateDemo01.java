package cc.adcat.jdbcTemplateDemo;

import cc.adcat.druidDemo.PoolsUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());
        String sql = "CREATE TABLE book(" +
                "bid INT PRIMARY KEY AUTO_INCREMENT," +
                "bname VARCHAR(20)," +
                "price DOUBLE ," +
                "author VARCHAR(20))";
        jdbcTemplate.execute(sql);
    }
}
