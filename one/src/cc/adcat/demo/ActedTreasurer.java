package cc.adcat.demo;

public class ActedTreasurer extends Treasurer implements IActor {
    public ActedTreasurer() {
    }

    public ActedTreasurer(int id, String name) {
        super(id, name);
    }

    public ActedTreasurer(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void play() {
        System.out.println("工号为" + getId() + "的财务部员工" + getName() + "在表演魔术");

    }
}
