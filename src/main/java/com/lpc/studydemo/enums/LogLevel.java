package com.lpc.studydemo.enums;

/**
 * @author 刘鹏程
 */

public enum LogLevel {
    DEBUG("调试"),
    INFO("信息"),
    WARN("警告"),
    ERROR("错误");

    private final String description;

    LogLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

