package sunso.spring.cloud.demo.service.client.service;

import org.springframework.stereotype.Service;
import sunso.spring.cloud.demo.service.client.model.Animan;

/**
 * @Title:FeignHelloServiceFailure
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午4:03
 * @m444@126.com
 */
@Service
public class FeignHelloServiceFailure implements FeignHelloService {
    @Override
    public String getHello() {
        return "hello failure";
    }

    @Override
    public Animan getAniman() {
        return Animan.failureAniman();
    }

    @Override
    public Animan putAniman(Animan animan) {
        return Animan.failureAniman();
    }
}
