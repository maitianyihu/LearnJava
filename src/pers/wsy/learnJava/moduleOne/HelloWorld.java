package pers.wsy.learnJava.moduleOne;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String[] listStr = {"你好", "小红"};
        System.out.println(listStr[0]);
        System.out.println("字符串数组长度" + listStr.length);
        Dog dog = new Dog("小红狗");
        System.out.println("小狗的名字是" + dog.name);
        //调用对象方法
        dog.bark();

        Cat cat = new Cat("小花猫", 2);
        cat.bark();

    }
}

//同一个源文件中只能有一个 public class
class Cat {
    private static final String ANIMALNAME = "猫";//仅仅类内部访问
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        String formatStr = String.format("%s 喵喵喵，今年%d岁了，属于%s科动物",this.name,age,ANIMALNAME);
        System.out.println(formatStr);
        //与上面输出是同样效果
        System.out.printf("%s 喵喵喵，今年%d岁了，属于%s科动物",this.name,age,ANIMALNAME);
        //当前时间
        Date now = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("现在时间是"+formatDate.format(now));

    }
}