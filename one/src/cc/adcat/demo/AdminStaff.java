package cc.adcat.demo;

public class AdminStaff extends Employee{

    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的行政部员工" + getName() + "在采购物品");
    }

    public AdminStaff() {
    }

    public AdminStaff(int id, String name) {
        super(id, name);
    }

    public AdminStaff(int id, String name, int salary) {
        super(id, name, salary);
    }
}
