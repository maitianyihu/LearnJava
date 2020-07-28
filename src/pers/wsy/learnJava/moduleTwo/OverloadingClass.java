package pers.wsy.learnJava.moduleTwo;

public class OverloadingClass { //重载方法  方法名相同   参数不同，返回可以不同

    public int test() {
        System.out.println("test1");
        return 1;
    }

    public void test(int a) {
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a, String s) {
        System.out.println("test3");
        return "returntest3";
    }

    public String test(String s, int a) {
        System.out.println("test4");
        return "returntest4";
    }

    public static void main(String[] args) {
        OverloadingClass o = new OverloadingClass();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
    }
}
