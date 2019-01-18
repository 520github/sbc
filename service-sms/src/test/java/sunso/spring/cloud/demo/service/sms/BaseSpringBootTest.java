package sunso.spring.cloud.demo.service.sms;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Title:BaseSpringBootTest
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午9:20
 * @m444@126.com
 */

//@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ServiceSmsApplication.class})
public class BaseSpringBootTest {


}
