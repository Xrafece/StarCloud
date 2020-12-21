package com.xrafece.starcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Xrafece
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----fallback-paymentInfo_OK,  paymentInfo_OK can not run normal";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----fallback-paymentInfo_TimeOut,  paymentInfo_TimeOut can not run normal";
    }
}
