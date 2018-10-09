package cc.adcat.demo;

public class ActedDeveloper extends Developer implements IActor{

    public ActedDeveloper() {
    }

    public ActedDeveloper(int id, String name) {
        super(id, name);
    }

    public ActedDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void play() {
        System.out.println("工号为" + getId() + "的开发部员工" + getName() + "在唱歌");
    }
}
