package pers.wsy.learnJava.moduleThree;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("A");
        System.out.println(list);
         Object item =list.get(0);
        System.out.println(item);

        //泛型 new ArrayList后面的<>表示钻石表达式，或者成为菱形表达式，能自动推算出类型String，所以可以省略不写，JDK8之后的特性
        List<String> strList = new ArrayList<>();
//        strList.add(1); 这里报错，编译期检查

    }
}
