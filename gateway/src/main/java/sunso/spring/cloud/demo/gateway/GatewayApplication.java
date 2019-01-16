package sunso.spring.cloud.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Title:GatewayApplication
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午8:56
 * @m444@126.com
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
