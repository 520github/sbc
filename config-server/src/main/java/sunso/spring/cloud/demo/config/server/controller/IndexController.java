package sunso.spring.cloud.demo.config.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:IndexController
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午3:20
 * @m444@126.com
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "ok";
    }

}
