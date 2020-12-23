package com.xrafece.starcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Xrafece
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        // 路径规则：gateway:port/path ==> server:port/path
        // 路由记录的路径要和服务器资源保持相同路径
        // path:/bilibili --> gateway:port/bilibili ==> https://www.bilibili.com/bilibili
        routes.route("path_star_another_bilibili",
                r -> r.path("/account/history")
                        .uri("https://www.bilibili.com/account/history")).build();

        return routes.build();
    }
}
