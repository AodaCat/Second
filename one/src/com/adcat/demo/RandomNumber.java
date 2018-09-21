package com.adcat.demo;

import java.util.Random;

public class RandomNumber {

    int number;

    RandomNumber(){
        Random r = new Random();
        number = r.nextInt(80) + 20;
    }

    public void isOuShu(){
        if (number % 2 == 0){
            System.out.println("随机生成的数字为：" + number + " 为偶数");
        }else {
            System.out.println("随机生成的数字为：" + number + " 为奇数");
        }
    }
}
