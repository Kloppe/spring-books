/**
 * @program SpringBooks
 * @description: UserDao
 * @author: mf
 * @create: 2020/02/19 01:03
 */
package com.example.mybatis.dao;

import com.example.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {
    /**
     *
     * @param id
     * @return
     */
    User selectById(Integer id);
}
