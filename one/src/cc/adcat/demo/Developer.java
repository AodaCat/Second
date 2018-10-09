package cc.adcat.demo;

public class Developer extends Employee {
    public Developer() {
    }

    public Developer(int id, String name) {
        super(id, name);
    }

    public Developer(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的开发部员工" + getName() + "在开发JavaEE应用");
    }
}
