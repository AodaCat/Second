package cc.adcat.demo;

public class Boss {
    private String name;
    private int age;

    public void letWord(Employee e){
        e.work();
    }

    public void letPlay(IActor ia){
        ia.play();
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

    public Boss() {
    }

    public Boss(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
