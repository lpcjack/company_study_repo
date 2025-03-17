package com.lpc.studydemo.enums;

/**
 * @author 刘鹏程
 */
public enum PaymentMethod {
    CREDIT_CARD("信用卡"),
    PAYPAL("PayPal"),
    WECHAT_PAY("微信支付"),
    ALIPAY("支付宝"),
    BANK_TRANSFER("银行转账");

    private final String description;

    PaymentMethod(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
