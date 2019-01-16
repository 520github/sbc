package sunso.spring.cloud.demo.service.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunso.spring.cloud.demo.service.client.model.Animan;
import sunso.spring.cloud.demo.service.client.service.FeignHelloService;

/**
 * @Title:FeignHelloController
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午3:18
 * @m444@126.com
 */

@RestController
public class FeignHelloController {
    @Autowired
    FeignHelloService feignHelloService;

    @RequestMapping("/hello")
    public String getHello() {
        return feignHelloService.getHello();
    }

    @RequestMapping("/animan")
    public Animan getAniman() {
        Animan animan = feignHelloService.getAniman();
        System.out.println(animan.toString());
        return animan;
    }

    @RequestMapping("/animan/save")
    public Animan saveAniman() {
        return feignHelloService.putAniman(Animan.defaultAniman());
    }
}
