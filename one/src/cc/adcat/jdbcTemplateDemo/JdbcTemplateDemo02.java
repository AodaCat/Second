package cc.adcat.jdbcTemplateDemo;

import cc.adcat.druidDemo.PoolsUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo02 {

    public static void main(String[] args) {

    }

    public static void updateTest() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());
        String sql = "UPDATE book SET price = ?";
        int update = jdbcTemplate.update(sql, 100);
        System.out.println("update = " + update);
    }

    public static void deleteTest() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());
        String sql = "DELETE FROM book WHERE bid = ?";
        int update = jdbcTemplate.update(sql, 2);
        System.out.println("update = " + update);
    }

    public static void insertTest2() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());
        String sql = "INSERT INTO book VALUES (?, ?, ?, ?)";
        Object[] params = {
                null, "java编程思想", 66, "隔壁老宋"
        };
        int update = jdbcTemplate.update(sql, params);
        System.out.println("update = " + update);
    }

    public static void insertTest1() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());
        String sql = "INSERT INTO book VALUES (NULL,'java从入门到懵逼',99,'老王')";
        int update = jdbcTemplate.update(sql);
        System.out.println("update = " + update);
    }
}
