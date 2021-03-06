关于SpringCloud2020的学习项目

版本时间：2020-02

## 项目简介:

该项目是跟着Springcloud2020做出来的，里面涉及传统的 eureka、hystrix、ribbon，更是讲解了最新的 alibaba的 Nacos和sentinel、Seata，相当的给力。

## 官网文档传送门：

SpringCloud: https://spring.io/projects/spring-cloud/

这个网址是各springcloud组件的配置介绍，自己搭建组件环境可以考虑看这个。

Seata： https://seata.io/zh-cn/docs/overview/what-is-seata.html

分布式事务解决的框架，文档介绍很详细，推荐。

Nacos： https://nacos.io/zh-cn/docs/what-is-nacos.html

那个替代Eureka和Config的男人。

Sentinel：[https://github.com/alibaba/Sentinel/wiki/%E4%BB%8B%E7%BB%8D](https://github.com/alibaba/Sentinel/wiki/介绍)

在Hystrix基础上增加了流控规则和持久化,alibaba体系的一员。

## 序列

* <module>cloud-provider-payment8001</module>
* <module>cloud-common-entity</module>
* <module>cloud-consumer-order80</module>
* <module>cloud-eureka-server7001</module>
* <module>cloud-eureka-server7002</module>
* <module>cloud-provider-payment8002</module>
* <module>cloud-consumer-feign-order80</module>
* <module>cloud-provider-hystrix-payment8001</module>
* <module>cloud-consumer-feign-hystrix-order80</module>
* <module>cloud-consumer-hystrix-dashboard9001</module>
* <module>cloud-gateway-gateway9527</module>