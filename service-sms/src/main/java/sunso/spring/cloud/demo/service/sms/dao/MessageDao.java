package sunso.spring.cloud.demo.service.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sunso.spring.cloud.demo.service.sms.model.Message;

/**
 * @Title:MessageDao
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午7:54
 * @m444@126.com
 */
public interface MessageDao extends JpaRepository<Message, Long> {

}
