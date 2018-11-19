package cc.adcat.junitDemo;

import org.junit.Test;

import java.lang.reflect.Field;

public class Field01 {

    @Test
    public void test1() throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        Class aClass = student.getClass();
        Field field = aClass.getField("sex");
        field.set(student,"female");
        Object o = field.get(student);
        System.out.println(o);
        System.out.println(student);
        Field field1 = aClass.getDeclaredField("age");
        field1.setAccessible(true);
        field1.set(student, 18);
        Object o1 = field1.get(student);
        System.out.println(o1);
        System.out.println(student);

    }

}
