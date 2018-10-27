package cc.adcat.demo;

public class TryCatchDome {
    public int tryCatch(int i){
        try {
            if (i != 0){
                throw new Exception("try");
            }
            i++;
            System.out.println("try:" + i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            i++;
            System.out.println("catch:" + i);
            return i;
        } finally {
            i++;
            System.out.println("finally:" + i);
//            return i;
       }
    }
}
