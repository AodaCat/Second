package cc.adcat.junitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo01 {

    @Before
    public void before(){
        System.out.println("测试之前");
    }

    @After
    public void after(){
        System.out.println("测试之后");
    }

    @Test
    public void test1(){
        System.out.println(1);
    }

    @Test
    public void test2(){
        System.out.println(2);
    }

    @Test
    public void test3(){
        System.out.println(3);
    }
}
