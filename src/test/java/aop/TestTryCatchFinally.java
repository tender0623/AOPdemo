package aop;

/**
 * Created by Administrator on 2019/2/28.
 */
public class TestTryCatchFinally {
    static int doMethod() {
        int a = 10;
        try {
            return a;//两个步骤:(步骤1:先获取a的值,存储a的值)(步骤2:返回存储的a的值,finally执行结束执行)
        } finally {
            a++;
        }
    }
    static int doMethod2(){

        int a =10;
        try {
            int b=a/0;
            return a;//两个步骤:(步骤1:先获取a的值,存储a的值)(步骤2:返回存储的a的值,finally执行结束执行)
        }catch (Exception e){
           throw new RuntimeException(e);
        } finally {
            System.out.println("finally{}");
            a++;
        }
    }
    public static int method4(){
        try {
            return 10;
        }finally {
            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(method4());
    }
}
