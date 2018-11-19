package cc.adcat.annotationDemo;

@MyAnnotation(age = 20, name = "aaa", value = 30)
public class Student {

    @Deprecated
    @MyAnnotation(name = "bbb", value = 20)
    String name;
    private int age;

    public void show(){
        System.out.println("无参show方法");
    }

    public void show(int num){
        System.out.println("有参show方法" + num);
    }

    @Deprecated
    @MyAnnotation(50)
    private int method(int num){
        System.out.println("私有method方法");
        return num;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
