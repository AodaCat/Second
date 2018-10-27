package cc.adcat.demo;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public <MVP> void print(MVP mvp, MVP mvp1){
        System.out.println(mvp);
        System.out.println(mvp1);
    }
}
