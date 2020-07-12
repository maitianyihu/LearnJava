package pers.wsy.learnJava.moduleThree;


//自定义泛型 F 指定任意类型的  get方法只能返回被指定的类型
// F 只能是引用类型  不能是java基础类型
public class CustomType<F> {

    public void dosome(F f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        CustomType<Integer> customType = new CustomType<>();
        customType.dosome(1);//这里只能传递 integer类型
    }
}



