package sunso.spring.cloud.demo.service.sms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Title:Message
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/18下午7:35
 * @m444@126.com
 */
@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="content", nullable = false, length = 5000)
    private String content;

    @Column(name="count", nullable = false, length = 4)
    private int count;

    public static Message defaultMessage() {
        return new Message().setContent("default content").setCount(0);
    }

    public Long getId() {
        return id;
    }

    public Message setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Message setCount(int count) {
        this.count = count;
        return this;
    }
}
