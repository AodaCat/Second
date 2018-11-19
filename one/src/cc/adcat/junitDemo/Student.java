package cc.adcat.junitDemo;

public class Student {
    private String name;
    private int age;
    public String sex;

    private boolean show() {
        System.out.println(name + age + sex);
        return true;
    }

    public Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
