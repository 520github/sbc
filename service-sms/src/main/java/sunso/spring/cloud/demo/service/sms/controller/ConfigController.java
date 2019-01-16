package sunso.spring.cloud.demo.service.sms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:ConfigController
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16上午10:54
 * @m444@126.com
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hello")
    public String getHelloConfig() {
        return hello;
    }
}
