package com.lpc.studydemo.service;

import com.lpc.studydemo.dto.UserDto;

/**
 * @author 刘鹏程
 */
public interface UserService {
    UserDto selectById(Integer id);
}
