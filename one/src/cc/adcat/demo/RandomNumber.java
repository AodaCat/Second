package cc.adcat.demo;

import java.util.Random;

public class RandomNumber {

    private int number;

    RandomNumber(){
        Random r = new Random();
        number = r.nextInt(80) + 20;
    }

    //随机生成不同的随机数，并存储在指定数组中
    public static void shu(int[] arr, int num){
        int count = 0;
        Random r = new Random();
        while (count < arr.length ){
            arr[count] = r.nextInt(num);
            if(count == 0){
                count++;
                continue;
            }
            for(int i = 0; i< count ; i++){
                if(arr[i] == arr[count]){
                    break;
                }
                if(i == count - 1){
                    count++;
                    break;
                }
            }
        }
    }




    public void isOuShu(){
        if (number % 2 == 0){
            System.out.println("随机生成的数字为：" + number + " 为偶数");
        }else {
            System.out.println("随机生成的数字为：" + number + " 为奇数");
        }
    }
}
