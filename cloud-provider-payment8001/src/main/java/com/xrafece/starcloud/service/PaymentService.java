package com.xrafece.starcloud.service;

import com.xrafece.starcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Xrafece
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
