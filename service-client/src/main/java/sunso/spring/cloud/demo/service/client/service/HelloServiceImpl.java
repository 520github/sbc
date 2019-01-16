package sunso.spring.cloud.demo.service.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Title:HelloServiceImpl
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午2:20
 * @m444@126.com
 */
@Service
public class HelloServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getHelloFailure")
    public String getHello() {
        return restTemplate.getForObject("http://service-core/", String.class);
    }

    public String getHelloFailure() {
        return "failure get hello from service-core";
    }
}
