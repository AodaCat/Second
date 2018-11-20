package cc.adcat.jdbcTemplateDemo;

import cc.adcat.druidDemo.PoolsUtil;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo03 {
    public static JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());

    public static void main(String[] args) {
        String s = "select * from book where bid = ?";
        Map<String, Object> map = jdbcTemplate.queryForMap(s, 1);
        System.out.println("map = " + map);

        List<Map<String, Object>> maps = jdbcTemplate.queryForList(s, 1);
        for (Map<String, Object> map1 : maps) {
            System.out.println("map1 = " + map1);
        }
    }

    public static void queryForObjectTest() {
        String sql = "SELECT COUNT(*) FROM book";
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("result = " + result);

        String sql1 = "select bname from book where bid = ?";
        String s = jdbcTemplate.queryForObject(sql1, String.class, 1);
        System.out.println("s = " + s);
    }
}
