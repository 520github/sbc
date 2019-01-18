package sunso.spring.cloud.demo.service.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunso.spring.cloud.demo.service.sms.model.Message;
import sunso.spring.cloud.demo.service.sms.service.MessageService;

/**
 * @Title:MessageController
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午7:58
 * @m444@126.com
 */
@RestController()
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/save")
    public Message save() {
        Message save = messageService.save(Message.defaultMessage());
        return messageService.get(save.getId());
    }

}
