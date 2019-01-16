package sunso.spring.cloud.demo.service.client.model;

/**
 * @Title:Animan
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/16下午3:30
 * @m444@126.com
 */
public class Animan {

    private String name;
    private String sex;
    private int age;

    public static Animan defaultAniman() {
        return new Animan().setName("盘古").setSex("man").setAge(100);
    }

    public static Animan failureAniman() {
        return new Animan().setName("失败").setSex("失败").setAge(-1);
    }

    public String getName() {
        return name;
    }

    public Animan setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Animan setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animan setAge(int age) {
        this.age = age;
        return this;
    }

    public String toString() {
        return "name:" + name + ", sex:" + sex + ",age:"+age;
    }
}
