package cc.adcat.demo;

import java.util.*;

public class Demo {

    public static void main(String[] args){

        List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);

//        //创建集合对象
//        ArrayList list = new ArrayList<>();
//
//        //定义字符串对象
//        String s1 = "曹操";
//        String s2 = "刘备";
//        String s3 = "孙权";
//        int i1 = 1;
//        s3 = i1 + "";
//
//        //打印ArrayList集合
//        System.out.println(list);

//        //把字符串作为元素添加到集合
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(i1);
//
//        //打印ArrayList集合
//        System.out.println(list);

//        int num = 97;
//        char c1 = 'b';
//        char c2 = 99;
//        byte b1 = 'd';
//        byte b2 = 101;
//        num = c1;
//        System.out.println(num);
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(b1);
//        System.out.println(b2);
//
//        /**
//         * 商场举办活动，如果商场会员卡号（为4位整数）的十位数字，
//         * 和产生的随机数相同，则为当天的幸运客户。
//         * 定义功能，判断会员是否为幸运客户。
//         *
//         * 为方便测试，暂定可以连续输入5次。
//         */
//        Scanner input = new Scanner(System.in);
//
//////        }  for (int i = 0; i < 5; i++) {
//            System.out.print("请输入四位会员卡号：");
//            new LuckyCard(input.nextInt()).isLuckyNumber();

//        //随机生成20-100之间的数字，判断其是否为偶数
//        for (int i = 0; i < 5; i++) {
//            new RandomNumber().isOuShu();
//        }

//        //使用重载方法完成乘法表的输出
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        new MulTable().print(num);
//        new MulTable().print();

//        // 构造器和成员方法重载
//        Tree tree = new Tree();
//        tree.print();
//        tree.print("print方法重载");
//
//        Tree tree1 = new Tree(3);
//        tree1.print();
//        tree1.print("print方法重载");
//
//        //this关键字的使用
//        Leaf x = new Leaf();
//        x.increment().increment().increment().increment().print();
    }
}