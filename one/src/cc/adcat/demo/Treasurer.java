package cc.adcat.demo;

public class Treasurer extends Employee {
    public Treasurer() {
    }

    public Treasurer(int id, String name) {
        super(id, name);
    }

    public Treasurer(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的财务部员工" + getName() + "在对账");
    }
}
