package cc.adcat.demo;

public class BaoZiZuo implements Runnable {
    private BaoZi bz;

    public BaoZiZuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        for (;;)
            zuo();
    }

    private void zuo() {
        synchronized (bz){
            if (bz.getNum() ==0){
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            bz.setNum(0);
            System.out.println("做" + bz.getName());
            bz.notify();
        }
    }
}
