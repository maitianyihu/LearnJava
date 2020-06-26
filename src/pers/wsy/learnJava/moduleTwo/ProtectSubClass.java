package pers.wsy.learnJava.moduleTwo;

import pers.wsy.learnJava.moduleOne.ProtectSuperClass;

public class ProtectSubClass extends ProtectSuperClass {

    public void askSupperProtectedMethod(){
        super.test();
    }

    @Override
    protected void test(){
        //如果这里不重写 由于父类的test方法是protected属性，那么此类的实例化的对象无法访问继承过来的父类的test方法。
        System.out.println("我调了自己的test");
    }
}
