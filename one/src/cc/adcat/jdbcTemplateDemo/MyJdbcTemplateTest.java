package cc.adcat.jdbcTemplateDemo;

import cc.adcat.druidDemo.PoolsUtil;

public class MyJdbcTemplateTest {
    public static void main(String[] args) {
        MyJdbcTemplate myJdbcTemplate = new MyJdbcTemplate(PoolsUtil.getDataSource());
        String sql = "INSERT INTO book VALUES (?, ?, ?, ?)";
        Object[] params = {
                null, "java编程思想", 66, "老宋"
        };
        int update = myJdbcTemplate.update(sql, params);
        System.out.println("update = " + update);
    }
}
