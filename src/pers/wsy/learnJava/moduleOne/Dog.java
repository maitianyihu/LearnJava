package pers.wsy.learnJava.moduleOne;

public class Dog {
    //成员变量
    String name;
    int age;//初始值是0 默认值

    public Dog(String name) {
        this.name = name;
    }

    //成员方法
    void bark() {
        System.out.println(this.name+age+ "岁了，汪汪汪~咬坏人");
    }
}