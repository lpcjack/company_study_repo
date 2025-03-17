package com.lpc.studydemo.enums;

/**
 * @author 刘鹏程
 */

public enum UserRole {
    ADMIN("管理员"),
    USER("普通用户"),
    GUEST("访客");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

