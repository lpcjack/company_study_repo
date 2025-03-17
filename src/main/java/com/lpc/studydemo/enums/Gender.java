package com.lpc.studydemo.enums;

/**
 * @author 刘鹏程
 */

public enum Gender {

    MALE("男"),
    FEMALE("女"),
    OTHER("其他");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
