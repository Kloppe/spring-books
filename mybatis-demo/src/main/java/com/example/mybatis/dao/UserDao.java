/**
 * @program SpringBooks
 * @description: UserDao
 * @author: mf
 * @create: 2020/02/19 01:03
 */
package com.example.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao extends BaseMapper<User> {

    /**
     * 返回全部用户
     * @return
     */
    @Select("select * from rsd_user")
    List<User> selectAll();

    /**
     * 通过id返回User
     * @param id
     * @return
     */
    User selectById(Integer id);
}
