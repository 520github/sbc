package com.codingapi.tm;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title:RestConfig
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/20下午4:34
 * @m444@126.com
 */
@Configuration
@EnableAutoConfiguration
public class RestConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
