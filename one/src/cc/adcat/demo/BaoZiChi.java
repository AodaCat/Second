package cc.adcat.demo;

public class BaoZiChi implements Runnable {
    private BaoZi bz;

    public BaoZiChi(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        for (;;)
            eat();
    }

    private  void eat() {
        synchronized (bz){
            if(bz.getNum() > 0){
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            bz.setNum(1);
            System.out.println("吃" + bz.getName());
            bz.notify();
        }
    }
}
