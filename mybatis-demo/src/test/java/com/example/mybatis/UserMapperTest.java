/**
 * @program SpringBooks
 * @description: UserMapperTest
 * @author: mf
 * @create: 2020/02/19 01:44
 */

package com.example.mybatis;

import com.example.mybatis.bean.User;
import com.example.mybatis.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserMapperTest extends MybatisApplicationTests {

    @Autowired
    private UserDao userDao;


    @Test
    void selectById() {
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    void selectAll() {
        List<User> users = userDao.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
