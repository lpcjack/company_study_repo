package com.lpc.studydemo.mapper;

import com.lpc.studydemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 刘鹏程
 */

@Mapper
public interface UserMapper {
    User selectById(Integer id);
}
