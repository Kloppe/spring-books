package com.example.mybatis;

import com.example.mybatis.bean.User;
import com.example.mybatis.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    void selectById() {
        User user = userDao.selectById(1);
        System.out.println(user);
    }

}
