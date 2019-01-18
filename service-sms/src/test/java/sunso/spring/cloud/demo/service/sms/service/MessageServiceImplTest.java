package sunso.spring.cloud.demo.service.sms.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sunso.spring.cloud.demo.service.sms.BaseSpringBootTest;
import sunso.spring.cloud.demo.service.sms.model.Message;

/**
 * @Title:MessageServiceImplTest
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午9:21
 * @m444@126.com
 */
public class MessageServiceImplTest extends BaseSpringBootTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void save() {
        Message message = messageService.save(Message.defaultMessage());
        Assert.assertNotNull(message);
        Assert.assertEquals(message.getContent(), Message.defaultMessage().getContent());
        Assert.assertEquals(message.getCount(), Message.defaultMessage().getCount());
    }
}
