package pers.wsy.learnJava.moduleTwo;

public class TestClass {
    public static void main(String[] args) {
        ProtectSubClass subClass = new  ProtectSubClass();
        subClass.test();  //这里subclass只能调用到本类的test方法，无法调用到父类的protected属性的test方法
        subClass.testTwo();
    }
}
