package sunso.spring.cloud.demo.service.core.model;

/**
 * @Title:Person
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午3:26
 * @m444@126.com
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public static Person defaultPerson() {
        return new Person().setName("未知人").setSex("unknown").setAge(0);
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Person setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String toString() {
        return "name:" + name + ", sex:" + sex + ",age:"+age;
    }
}
