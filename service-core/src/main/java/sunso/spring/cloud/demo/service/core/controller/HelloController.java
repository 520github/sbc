package sunso.spring.cloud.demo.service.core.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sunso.spring.cloud.demo.service.core.model.Person;

/**
 * @Title:HelloController
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/15下午11:09
 * @m444@126.com
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @HystrixCommand(fallbackMethod = "failureHome")
    @RequestMapping("/")
    public String home() {
        return "hello world from port " + port;
    }

    @RequestMapping("/person")
    public Person getPerson() {
        return Person.defaultPerson();
    }

    @RequestMapping(value = "/person/save", method = RequestMethod.POST)
    public Person putPerson(@RequestBody  Person person) {
        System.out.println(person.toString());
        return person;
    }

    public String failureHome() {
        return "failure home";
    }
}
