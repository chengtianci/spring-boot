package com.bocsoft.arguide.dao;

import com.bocsoft.arguide.dao.entity.User;
import com.bocsoft.arguide.dao.mapper.UserMapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName : UserDao
 * @Description : 用户表--数据处理层
 * @author : chengtc
 * @date : 2020年07月14日08:24:29
 */
@Component
public class UserDao  {

    @Autowired
    private UserMapper userMapper;

    /**
     * @Description 查询User数据并进行处理
     * @param id
     * @return User
     */
    public User selectByPrimaryKey(Long id) {
        //数据处理层--此处省略了数据处理过程直接return了
        return userMapper.selectByPrimaryKey(id);
    }
}
