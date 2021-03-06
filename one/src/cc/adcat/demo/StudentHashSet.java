package cc.adcat.demo;

import java.io.Serializable;
import java.util.Objects;

public class StudentHashSet implements Serializable{
    private static final long serialVersionUID = -2716695906732659326L;
    private String name;
    private int age;

    public StudentHashSet() {
    }

    public StudentHashSet(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentHashSet that = (StudentHashSet) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "StudentHashSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
