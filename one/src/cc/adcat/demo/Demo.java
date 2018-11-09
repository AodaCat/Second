package cc.adcat.demo;

import java.io.*;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        list.add("aaaa");
//        list.add("bbbb");
//        list.add("cccc");
//        list.stream().filter(str->str.startsWith("a") && str.length()==4).forEach(System.out::println);
//        Stream<String> stringStream = list.stream();
//        System.out.println(Arrays.toString(stringStream.toArray()));
//        HashSet<String> stringHashSet = new HashSet<>();
//        stringHashSet.add("aaa");
//        stringHashSet.add("bbb");
//        stringHashSet.add("ccc");
//        stringHashSet.add("aaaa");
//        stringHashSet.add("bbbb");
//        stringHashSet.add("cccc");
//        Stream<String> stringStream1 = stringHashSet.stream();
//        System.out.println(Arrays.toString(stringStream1.toArray()));
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "aaa");
//        hashMap.put(2, "bbb");
//        hashMap.put(3, "ccc");
//        hashMap.put(4, "aaaa");
//        hashMap.put(5, "bbbb");
//        hashMap.put(6, "cccc");
//        Stream<Integer> integerStream = hashMap.keySet().stream();
//        integerStream.forEach(num->System.out.println(hashMap.get(num)));
//        Stream<HashMap.Entry<Integer,String>> entryStream = hashMap.entrySet().stream();
//        entryStream.forEach(entry->System.out.println(entry.getKey() + entry.getValue()));
//        Stream<String> stringStream2 = Stream.of("aaa", "bbb", "ccc");
//        Object[] objects = stringStream2.toArray();
//        for (Object object : objects) {
//            System.out.println((String)object);
//        }
//        System.out.println(Arrays.toString(objects));
//        String[] strings = stringStream2.toArray(String[]::new);
//        System.out.println(Arrays.toString(strings));
//        List<String> arrayList = stringStream2.collect(Collectors.toList());
//        System.out.println(arrayList);


//        int[] src = new int[]{1,2,3,4,5};
//        int[] dest = new int[]{6,7,8,9,10};
//        System.arraycopy( src, 0, dest, 0, 3);
//        Arrays.toString(src);
//        Arrays.toString(dest);
//        Arrays.toString(src);

//        ArrayList<StudentHashSet> shs = new ArrayList<>();
//        shs.add(new StudentHashSet("abc", 18));
//        shs.add(new StudentHashSet("def", 20));
//        shs.add(new StudentHashSet("ghk", 19));
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text.txt"));
//        oos.writeObject(shs);
//        oos.flush();
//        oos.close();
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text.txt"));
//        ArrayList<StudentHashSet> o = (ArrayList<StudentHashSet>) ois.readObject();
//        ois.close();
//        System.out.println(o.get(0).toString());
//        System.out.println(o.get(1).toString());
//        System.out.println(o.get(2).toString());

//        OutputStreamWriter bw = new OutputStreamWriter(new FileOutputStream("text.txt"),"utf8");
//        bw.write("滴滴滴hello");
//        bw.flush();
//        bw.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
//        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            String str = input.nextLine();
//            bw.write(str);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
//        String str1 = input.nextLine();
//        for (int i = 0; i < 3; i++) {
//            if (str1.equals(br.readLine())){
//                System.out.println(true);
//                return;
//            }
//            if (i == 2){
//                System.out.println(false);
//            }
//        }


//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text1.txt"));
//        byte[] temp = new byte[1024];
//        int length;
//        while ((length = bis.read(temp)) != -1){
//            bos.write(temp, 0, length);
//            bos.flush();
//        }
//        bos.close();
//        bis.close();

//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text1.txt"));
//        bos.write('a');
//        bos.write("hello world".getBytes());
//        bos.flush();
//        bos.close();

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:/123.txt"),"gbk");
//        int temp;
//        while ((temp = isr.read()) != -1)
//            System.out.println((char)temp);
//        isr.close();


//        int a = 99;
//        System.out.println((char)a);

//        NumFrequency.numFre("text.txt", 'a');

//        FileOutputStream fos = new FileOutputStream("text1.txt");
//        Scanner input = new Scanner(System.in);
//        while (true){
//            String str = input.nextLine();
//            System.out.println("str = " + str);
//            if (str.equals("886")){
//                fos.close();
//                return;
//            }else {
//
//                fos.write(str.getBytes());
//                fos.write('\r');
//                fos.write('\n');
//            }
//        }


//        FileInputStream fis = new FileInputStream("text.txt");
//        FileOutputStream fos = new FileOutputStream("text1.txt");
//        int length;
//        byte[] temp = new byte[1024];
//        while ((length = fis.read(temp)) != -1){
//            fos.write(temp,0,length);
//        }
//        fos.close();
//        fis.close();

//        FileOutputStream fos = new FileOutputStream("text1.txt",true);
//        fos.write(97);
//        String str = "I love you";
//        fos.write(str.getBytes());
//        String str1 = "I love me";
//        for (int i = 0; i < 5; i++) {
//            fos.write(("" + '\r' + '\t' + str1).getBytes());
//        }
//        fos.close();


//        FileInputStream fis = new FileInputStream("text.txt");
//        FileOutputStream fos = new FileOutputStream("text1.txt");
//        byte[] temp = new byte[2];
//        int temp1;
//        while((temp1 = fis.read(temp)) != -1){
//            fos.write(temp,0,temp1);
//        }
//        fis.close();
//        fos.close();

//        FileWriter fw = new FileWriter("text.txt");
//        fw.write("97964486");
//        fw.close();

//        String s = "abc";
//        new PrintImpTest().print(new IPrint() {
//            @Override
//            public String printBegin() {
//                return s + "begin";
//            }
//
//            @Override
//            public String printTask() {
//                return s + "tasking";
//            }
//
//            @Override
//            public String printAfter() {
//                return s + "over";
//            }
//        });


//        Recursion.printDirFilter(new File("D:/test"));

//        Recursion.printDir(new File("D:/test"), ".txt");
//        Recursion.printDir(new File("D:/test"));
//        System.out.println(Recursion.sum(1000));

//        File filer = new File("D://test");
//        String[] fileList = filer.list();
//        for (String s : fileList) {
//            System.out.println(s);
//        }
//        File[] files = filer.listFiles();
//        for (File file : files) {
//            System.out.println(file);
//        }

//        String pathname = "D://test";
//        File dir = new File(pathname);
//        System.out.println(dir.mkdir());
//        File file = new File("D:/test/aaa.txt");
//        System.out.println(file.createNewFile());
//        System.out.println(file.getPath() + file.length() + file.exists());
//        File file1 = new File("D://test", "bbb.txt");
//        System.out.println(file1.createNewFile());
//        File file2 = new File(dir, "ccc.txt");
//        System.out.println(file2.createNewFile());

//        StudentHashSet[] sh = {
//                new StudentHashSet("aaa",20),
//                new StudentHashSet("bbb",15),
//                new StudentHashSet("ccc",30),
//                new StudentHashSet("ddd",25)};
//        Arrays.sort(sh, Comparator.comparingInt(StudentHashSet::getAge));
//        for (StudentHashSet s : sh) {
//            System.out.println(s);
//        }

//        //Lambda表达式
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("测试一");
//            }
//        };
//        new Thread(task).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("测试二");
//            }
//        }).start();

//        new Thread(()->System.out.println("测试三")).start();
//        new Thread(()->System.out.println(Thread.currentThread().getName() + "测试四"), "666").start();

//        //生产者与消费者
//        BaoZi baoZi = new BaoZi("肉包子", 1);
//        ExecutorService service = Executors.newFixedThreadPool(2);
//        service.submit(new BaoZiZuo(baoZi));
//        service.submit(new BaoZiChi(baoZi));

//        //excise9:
//        Tunnel tunnel = new Tunnel();
//        for (int i = 0; i < 10; i++) {
//            new Thread(tunnel, i + "").start();
//        }

//        int[] arr = new int[10];
//        System.out.println(arr[10]);

//        TryCatchDome tcd = new TryCatchDome();
//        System.out.println("main:" + tcd.tryCatch(0));

//        //Thread线程类
//        MyThread myThread = new MyThread("新线程1");
//        myThread.start();
//        MyThread myThread2 = new MyThread("新线程2");
//        myThread2.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("主线程" + i);
//        }

//        //Runnable接口
//        Thread myRunnable = new Thread(new MyRunnable());
//        myRunnable.start();
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main" + i);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        //洗牌，发牌
//        Poker poker = new Poker();
//        poker.pokerNo();
//        poker.playPoker();

//        String str = "abafefalfjafafaafaaa";
//        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
//        char[] characters = {'a', 'b', 'a'};
//        System.out.println(Arrays.asList(characters));
//        HashSet linkedList = new HashSet (Arrays.asList(strs));
//        for (Object s : linkedList) {
//            System.out.println(s);
//        }

//        LinkedHashSet<StudentHashSet> hs = new LinkedHashSet<StudentHashSet>();
//        hs.add(new StudentHashSet("abc",123));
//        hs.add(new StudentHashSet("def",456));
//        hs.add(new StudentHashSet("ghi",789));
//        hs.add(new StudentHashSet("jkl",666));
//
//        for (StudentHashSet h : hs) {
//            System.out.println(h);
//        }

//        MyGenericClass<String> my = new MyGenericClass<>();
//        my.setMvp("123");
//        System.out.println(my.getMvp());
//        my.print("abc", 123);
//        my.setMvp(456);
//        System.out.println(my.getMvp());

//        Collection<String> col = new ArrayList<>();
//        col.add("abc");
//        col.add("def");
//        col.add("g");
//        col.add("hjk");
//        System.out.println(col.toString());
//        for (String aCol : col) {
//            System.out.println(aCol);
//        }

//        String str = "2018-04-11";
//        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        // 将字符串转换成日期对象
//        Date date = null;
//        try {
//            date = sdf.parse(str);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);

//        //将字符串从正则表达式匹配的地方切开
//        String str = "Then, when you have found the shrubbery, you must " +
//                "cut down the mightiest tree in the forest... " +
//                "with... a herring!";
//        Splitting.split(str, " ");
//        Splitting.split(str, "\\W+");
//        Splitting.split(str, "n\\W+");
//        //字符串替换
//        System.out.println(str.replaceFirst("f\\w+", "located"));
//        System.out.println(str.replaceAll("f\\w+", "located"));
//        System.out.println(str.replaceAll("shrubery|tree|herring", "banana"));

//        //在String中检查匹配正则表达式
//        System.out.println("-1234".matches("-?\\d+"));
//        System.out.println("5678".matches("-?\\d+"));
//        System.out.println("+911".matches("-?\\d+"));
//        System.out.println("+911".matches("([-+])?\\d+"));

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

//        showLongTime(()->System.out.println(System.currentTimeMillis()));

//        getProduct(5,6,(a,b)->a*b);

//        decToHex(20,Integer::toHexString);

//        RandomUtil ns = new RandomUtil();
//        getRandomNumFromOneToNum(10,ns::nextInt);
//        getRandomNumFromAToB(3,7,ns::nextInt);
//        getRandomNumFromArray(new int[]{1,2,3,4,5,6},ns::nextInt);

//        System.out.println(Arrays.toString(getObj(() -> new String[5])));
//        System.out.println(getObj(()->{
//            HashSet<Integer> hs = new HashSet<>();
//            Random num = new Random();
//            for (int i = 0; i < 5; i++) {
//                hs.add(num.nextInt(20) + 1);
//            }
//            return hs;
//        }));
//        System.out.println(getObj(()->{
//            Calendar cale = Calendar.getInstance();
//            cale.setTime(new Date());
//            return cale.getTime();
//        }));

//        doJob("干活",System.out::println);
//        doJob("还干活",System.out::println,System.out::println);
//        doJob("总是干活",System.out::println);

//        String string = "Hello World";
//        method(System.out::println,
//                str->System.out.println(str.toUpperCase()),
//                str->System.out.println(str.toLowerCase()),
//                string);
//        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
//        method(str->System.out.print(str.split(",")[0] + '\t'),
//                str->System.out.println(str.split(",")[1]),
//                array);

//        method(str->str.length()==3, str->str.startsWith("st"), "str");

//        method(Integer::parseInt,"123");
//        method(str->Integer.parseInt(str) + 1, num->num.toString() + "1", "123", 123);


    }


//    public static void method(Function<String, Integer> function, String str){
//        System.out.println(function.apply(str));
//    }
//    public static void method(Function<String, Integer> function, Function<Integer,String>function1, String str, Integer num){
//        System.out.println(function.apply(str));
//        System.out.println(function.andThen(function1).apply(str));
//        System.out.println(function.compose(function1).apply(num));
//    }

//    public static void method(Predicate<String> predicate, Predicate<String> predicate1, String str){
//        System.out.println(predicate.negate().and(predicate1).test(str));
//    }

//    public static void method(Consumer<String> con, Consumer<String> con1,Consumer<String> con2, String str){
//        con.andThen(con1.andThen(con2)).accept(str);
//    }
//    public static void method(Consumer<String> con, Consumer<String> con1, String[] array){
//        for (String str : array) {
//            con.andThen(con1).accept(str);
//        }
//    }

//    public static <T> void doJob(T t, Consumer<T> consumer){
//        consumer.accept(t);
//    }
//    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2){
//        consumer1.andThen(consumer2).accept(t);
//    }

//    public static <T>T getObj(Supplier<T> supplier){
//        return supplier.get();
//    }

//    public static void getRandomNumFromOneToNum(int num, NumberSupplier ns){
//        System.out.println(ns.getNum(num));
//    }
//    public static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns){
//        System.out.println(ns.getNum(a, b));
//    }
//    public static void getRandomNumFromArray(int[] nums, NumberSupplier ns){
//        System.out.println(ns.getNum(nums));
//    }

//    public static void decToHex(int num, NumberToString nts){
//        System.out.println(nts.convert(num));
//    }

//    public static void getProduct(int a, int b, IntCalc calc){
//        System.out.println(calc.calc(a, b));
//    }

//    public static void showLongTime(CurrentTimePrinter ctp){
//        ctp.printCurrentTime();
//    }

    //        p.playVolleyball();
    //        p.playSoccer();
    //        p.playBasketball();
//    public static void join(IPlayer p){

//    }

}
