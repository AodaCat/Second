package cc.adcat.proxyDemo;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        Class clazz = String.class;
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        Class clazz1 = ClassLoaderDemo.class;
        ClassLoader classLoader1 = clazz1.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println("classLoader2 = " + classLoader2);
        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println("classLoader3 = " + classLoader3);
    }
}
