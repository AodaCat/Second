package cc.adcat.junitDemo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Method01 {

    @Test
    public void test1() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Student.class;
        Method method = clazz.getDeclaredMethod("show");
        method.setAccessible(true);
        Object invoke = method.invoke(clazz.newInstance());
        System.out.println(invoke);
    }

}
