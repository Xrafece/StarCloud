package com.xrafece.starcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Xrafece
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // @LoadBalanced
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}