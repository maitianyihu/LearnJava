package pers.wsy.learnJava.moduleOne;

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

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(this.name + "喵喵喵~" + "今年" + this.age + "岁");
    }
}