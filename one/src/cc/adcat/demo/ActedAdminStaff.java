package cc.adcat.demo;

public class ActedAdminStaff extends AdminStaff implements IActor {

    public ActedAdminStaff() {
    }

    public ActedAdminStaff(int id, String name) {
        super(id, name);
    }

    public ActedAdminStaff(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void play() {
        System.out.println("工号为" + getId() + "的行政部员工" + getName() + "在跳舞");
    }
}
