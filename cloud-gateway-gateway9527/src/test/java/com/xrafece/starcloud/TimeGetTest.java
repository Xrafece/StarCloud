package com.xrafece.starcloud;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.time.ZonedDateTime;

/**
 * @author Xrafece
 */
// Junit4 要求测试类和测试方法共有并且测试方法无返回值，
// 但是 Junit5 只要求测试类和测试方法非私有，
// 所以 Junit5 测试类和测试方法经常使用默认访问修饰
class TimeGetTest {
    // @Test
    @RepeatedTest(1)
    @DisplayName("获取jdk1.8时间")
    void getTime() {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
