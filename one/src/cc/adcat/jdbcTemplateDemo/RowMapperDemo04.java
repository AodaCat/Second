package cc.adcat.jdbcTemplateDemo;

import cc.adcat.druidDemo.PoolsUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RowMapperDemo04 {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(PoolsUtil.getDataSource());
        String s = "select * from book";

//        List<Book> books = jdbcTemplate.query(s, (resultSet, i) -> new Book(
//                resultSet.getInt("bid"),
//                resultSet.getString("bname"),
//                resultSet.getDouble("price"),
//                resultSet.getString("author")
//        ));
        List<Book> books = jdbcTemplate.query(s, new BeanPropertyRowMapper<>(Book.class));

        for (Book book : books) {
            System.out.println(book);
        }

    }
}
