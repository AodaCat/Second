package cc.adcat.demo;

import java.io.PrintStream;
import java.util.*;

public class Demo {

    public static void main(String[] args){


//        //十六进制转储
//        byte[] a = new byte[]{100,125,3};
//        if(args.length == 0){
//            System.out.println(Hex.format(new byte[]{100,125,3}));
//        }

//        //String.format()方法的使用
//        try {
//            throw new DatabaseException(3, 7, "Write failed");
//        }catch (Exception e){
//            System.out.println(e);
//        }

//        //格式化说明符
//        Receipt receipt = new Receipt();
//        receipt.printTitle();
//        receipt.print("iPhone", 1, 6666);
//        receipt.print("iMac", 2, 8888);
//        receipt.printTotal();

//        //Formatter类
//        PrintStream outAlias = System.out;
//        Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
//        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
//        tommy.move(0, 0);
//        terry.move(4, 8);

//        Pet p1 = new Pet("Tom") {
//            @Override
//            public void eat() {
//                System.out.println("宠物1叫" + getName() + "在吃鱼");
//            }
//        };
//        Pet p2 = new Pet("小黑") {
//            @Override
//            public void eat() {
//                System.out.println("宠物2叫" + getName() + "在啃骨头");
//            }
//        };
//        p1.eat();
//        p2.eat();

//        join(new IPlayer() {
//            @Override
//            public void playBasketball() {
//                System.out.println("play basketball");
//            }
//
//            @Override
//            public void playSoccer() {
//                System.out.println("play soccer");
//            }
//
//            @Override
//            public void playVolleyball() {
//                System.out.println("play volleyball");
//            }
//        });

//        int i= 0;
//        i = new Scanner(System.in).nextInt();
//        int[] ai = new int[i];

//        ActedAdminStaff aa = new ActedAdminStaff(001, "景甜",5000);
//        ActedDeveloper ad = new ActedDeveloper(100,"林俊杰", 8000);
//        ActedTreasurer at = new ActedTreasurer(202, "周杰伦", 10000);
//        Boss bs = new Boss("马云", 66);
//
//        bs.letWord(aa);
//        bs.letPlay(aa);
//        bs.letWord(ad);
//        bs.letPlay(ad);
//        bs.letWord(at);
//        bs.letPlay(at);

//        //获取指定字符，在字符串中出现的次数
//        Scanner input = new Scanner(System.in);
//        String s = input.next();
//        char c = input.next().charAt(0);
//        int num = new StringCharNum().getNum(s, c);
//        System.out.println(num);
//        //对字符串中的数据进行排序
//        String s1 = new StringCharNum().sortString(s);
//        System.out.println(s1);

//        //随机生成不同的随机数，并存储在指定数组中
//        int[] arr = new int[20];
//        RandomNumber.shu(arr, 40);
//        for (int anArr : arr) {
//            System.out.print(anArr + " ");
//        }

//        List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new InfiniteRecursion());
//        }
//        System.out.println(list);

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

//    public static void join(IPlayer p){
//        p.playBasketball();
//        p.playSoccer();
//        p.playVolleyball();
//    }

}
