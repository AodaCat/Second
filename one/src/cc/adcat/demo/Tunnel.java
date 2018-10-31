package cc.adcat.demo;

public class Tunnel implements Runnable {
    private int num = 0;
    @Override
    public void run() {
        cross();
    }

    private synchronized void cross() {
        try {
            Thread.sleep(100);
            num++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "是第" + num + "个人通过山洞");
    }
}
