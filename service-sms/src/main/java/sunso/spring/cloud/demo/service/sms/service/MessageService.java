package sunso.spring.cloud.demo.service.sms.service;

import sunso.spring.cloud.demo.service.sms.model.Message;

/**
 * @Title:MessageService
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午7:56
 * @m444@126.com
 */
public interface MessageService {

    public Message save(Message message);

    public Message get(Long id);
}
