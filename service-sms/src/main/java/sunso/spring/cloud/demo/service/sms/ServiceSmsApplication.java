package sunso.spring.cloud.demo.service.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title:ServiceSmsApplication
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16上午10:45
 * @m444@126.com
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSmsApplication.class, args);
    }
}
