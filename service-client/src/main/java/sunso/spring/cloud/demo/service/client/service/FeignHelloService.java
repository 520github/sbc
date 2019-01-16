package sunso.spring.cloud.demo.service.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sunso.spring.cloud.demo.service.client.model.Animan;

/**
 * @Title:FeignHelloService
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午3:16
 * @m444@126.com
 */

@FeignClient(value = "service-core", fallback = FeignHelloServiceFailure.class)
public interface FeignHelloService {

    @RequestMapping("/")
    String getHello();

    @RequestMapping("/person")
    Animan getAniman();

    @RequestMapping(value = "/person/save", method = RequestMethod.POST)
    Animan putAniman(Animan animan);
}
