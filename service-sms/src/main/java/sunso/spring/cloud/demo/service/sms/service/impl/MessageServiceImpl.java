package sunso.spring.cloud.demo.service.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sunso.spring.cloud.demo.service.sms.dao.MessageDao;
import sunso.spring.cloud.demo.service.sms.model.Message;
import sunso.spring.cloud.demo.service.sms.service.MessageService;

/**
 * @Title:MessageServiceImpl
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午7:57
 * @m444@126.com
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public Message save(Message message) {
        return messageDao.save(message);
    }

    @Override
    public Message get(Long id) {
        return messageDao.getOne(id);
    }
}
