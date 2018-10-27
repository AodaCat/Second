package cc.adcat.demo;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public synchronized void start() {
        super.start();
        System.out.println(getName() + "启动！");
    }

    @Override
    public void run() {
        for (int i = 0; i < 14; i++) {
            System.out.println(getName() + ": 正在运行！" + i);
        }
    }
}
