package cc.adcat.demo;

@FunctionalInterface
public interface NumberSupplier {
    int getNum(int... num);
}
