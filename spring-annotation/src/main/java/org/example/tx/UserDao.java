/**
 * @program SpringBooks
 * @description: UserDao
 * @author: mf
 * @create: 2020/02/02 00:03
 */

package org.example.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "insert into `t_admin` (username, password) values (?,?);";
        String username = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update(sql, username, "123");
    }
}
