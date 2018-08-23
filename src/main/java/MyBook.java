package main.java;

//import org.aspectj.lang.ProceedingJoinPoint;
/**
 * Created by Bloom on 2018/6/3.
 */
public class MyBook {


    public void before(){
        System.out.println("=============before===========");
    }
    public void around1() throws Throwable {
        System.out.println("=============before===========");

    }


}
