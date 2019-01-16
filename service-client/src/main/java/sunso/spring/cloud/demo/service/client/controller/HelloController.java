package sunso.spring.cloud.demo.service.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunso.spring.cloud.demo.service.client.service.HelloServiceImpl;

/**
 * @Title:HelloController
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午2:26
 * @m444@126.com
 */
@RestController
public class HelloController {

    @Autowired
    HelloServiceImpl helloService;

    @RequestMapping("/")
    public String hello() {
        return helloService.getHello();
    }
}
