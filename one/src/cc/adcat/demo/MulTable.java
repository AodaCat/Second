package cc.adcat.demo;

//Multiplication table
public class MulTable {

    public void print(){
        print(9);
    }

    public void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " * " + i + " = " + j*i + '\t');
            }
            System.out.print('\n');
        }
    }
}
