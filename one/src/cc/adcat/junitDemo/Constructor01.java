package cc.adcat.junitDemo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructor01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("abc");
        student.setAge(18);
        System.out.println(student);
    }

    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("cc.adcat.junitDemo.Student");
        Object o = clazz.newInstance();
        System.out.println(o);
    }

    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("cc.adcat.junitDemo.Student");
        Constructor constructor = clazz.getConstructor(String.class, int.class, String.class);
        Object o = constructor.newInstance("abc",19,"female");
        System.out.println(o);
    }

    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("cc.adcat.junitDemo.Student");
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance("abc",19);
        System.out.println(o);
    }
}
