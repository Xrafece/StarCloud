package com.xrafece.starcloud.service.impl;

import com.xrafece.starcloud.dao.PaymentDao;
import com.xrafece.starcloud.entities.Payment;
import com.xrafece.starcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Xrafece
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}