package com.adcat.demo;

import java.util.Random;

public class LuckyCard {

    int number;

    LuckyCard(int number){
        this.number = number;
    }

    private int luckyNumber(){
        Random r = new Random();
        return r.nextInt(9);
    }

    public boolean isLuckyNumber(){
        int num = number / 10 % 10;
        int luckyNum = luckyNumber();
        if (num == luckyNum){
            System.out.println("该客户为幸运客户，幸运数字为：" + luckyNum);
        }else {
            System.out.println("该客户不是幸运客户，幸运数字为：" + luckyNum);
        }
        return num == luckyNum;
    }
}
