package cc.adcat.demo;

public class PrintImpTest {
    public void print(IPrint ip){
        System.out.println(ip.printBegin());
        System.out.println(ip.printTask());
        System.out.println(ip.printAfter());
    }
}
