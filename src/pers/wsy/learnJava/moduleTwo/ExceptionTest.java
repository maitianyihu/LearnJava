package pers.wsy.learnJava.moduleTwo;

public class ExceptionTest {
    public static void main(String[] args) {

        /*
        * 这里编译时报错，需要对throw ClassNotFoundException进行与处理
        * */
//        doSome();

        //处理方式1 继续上抛，抛给调用者，最终到JVM那里去 main方法后添加throw ClassNotFountException
        // 处理方式2 捕捉
        try {
            doSome();
        } catch (ClassNotFoundException e){
            e.printStackTrace();//打印栈信息
        }
    }

    /*
    *  throw ClassNotFoundException意味着在执行过程中有可能出现ClassNotFoundException异常，这个异常继承自Exception类
    *  是属于编译时异常
    * */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("调用我的对象必须处理编译时异常ClassNotFoundException");
    }
}
