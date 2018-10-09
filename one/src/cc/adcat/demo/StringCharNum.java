package cc.adcat.demo;

public class StringCharNum {

    //获取指定字符，在字符串中出现的次数
    public int getNum(String s, char c){
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if(c == s.charAt(i)){
                num++;
            }
        }
        return num;
    }

    //对字符串中的数据进行排序
    public String sortString(String s){
        char[] c = s.toCharArray();
        int count = 0;
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < i; j++){
                if(c[i] < c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
        return new String(c);
    }
}
