package com.lpc.studydemo.enums;

/**
 * @author 刘鹏程
 */

public enum WorkflowStatus {
    PENDING("待审批"),
    APPROVED("审批通过"),
    REJECTED("审批拒绝"),
    COMPLETED("已完成");

    private final String description;

    WorkflowStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

