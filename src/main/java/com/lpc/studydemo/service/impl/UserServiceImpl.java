package com.lpc.studydemo.service.impl;

import com.lpc.studydemo.dto.UserDto;
import com.lpc.studydemo.entity.User;
import com.lpc.studydemo.mapper.UserMapper;
import com.lpc.studydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 刘鹏程
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto selectById(Integer id) {
        User user = userMapper.selectById(id);
        // 查询失败
        if (user == null) {
            return null;
        }
        // 成功返回信息
        return new UserDto(id, user.getUsername(), user.getGender());
    }


}
