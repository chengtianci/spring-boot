package com.bocsoft.arguide.dao.mapper;

import com.bocsoft.arguide.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : UserMapper
 * @Description : 用户表USER--持久化类
 * @author : chengtc
 * @date : 2020年07月14日08:24:29
 */
@Mapper
public interface UserMapper {
    /**
     *
     * @Title selectByPrimaryKey
     * @Desxription 根据 主键 查询User表
     * @Param id
     * @Return User
     * @author chengtc
     * @date 2020年07月15日08:53:33
     */
     User selectByPrimaryKey(@Param("id")Long id);
}
