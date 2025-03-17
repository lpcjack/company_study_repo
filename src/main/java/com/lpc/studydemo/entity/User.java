package com.lpc.studydemo.entity;

import lombok.*;

/**
 * @author 用户表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id; // id
    private String username; // 用户名
    private String password; // 密码
    private Character gender; // 性别
}
