package com.xrafece.starcloud.service.impl;

import com.xrafece.starcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Xrafece
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_OK,id:  " + id + "\t , 此方法不会延迟即可返回";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        //int age = 10/0;
        long timeOut = 3000;
        try {
            TimeUnit.MILLISECONDS.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:  " + Thread.currentThread().getName() + " id:  " +  id + "\t , 此方法运行耗时" + timeOut + "毫秒";
    }
}
