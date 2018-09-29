package cc.adcat.demo;

public class Tree {
    int number;

    Tree(){
        System.out.println("无参构造方法");
    }

    Tree(int number){
        this.number = number;
        System.out.println("有参构造方法");
    }

    void print(){
        System.out.println("print:number = " + number);
    }

    void print(String s){
        System.out.println(s + "print:number = " + number);
    }
}
