package cc.adcat.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker {

    private ArrayList<String> pokerList = new ArrayList<>();
    private HashMap<Integer, String> pokerMap = new HashMap<>();
    private ArrayList<Integer> pokerNum = new ArrayList<>();
    private ArrayList<Integer> playNo1 = new ArrayList<>();
    private ArrayList<Integer> playNo2 = new ArrayList<>();
    private ArrayList<Integer> playNo3 = new ArrayList<>();
    private ArrayList<Integer> playNo4 = new ArrayList<>();

    Poker() {
        pokerList();
        pokerMap();
        for(Integer i = 0; i < pokerList.size(); i++){
            pokerNum.add(i);
        }
    }

    //生成扑克牌字符串单列集合
    private void pokerList(){
        String[] colors = {"♣", "♥", "♠","♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        pokerList.add("☻");
        pokerList.add("☺");
        for (String number : numbers) {
            for (String color : colors) {
                pokerList.add(number + color);
            }
        }
//        System.out.println(pokerList);
    }

    //生成扑克牌字符串单列集合
    private void pokerMap(){
        for (Integer i = 0; i < pokerList.size(); i++) {
            pokerMap.put(i, pokerList.get(i));
        }
//        System.out.println(pokerMap);
    }

    //洗牌
    public void pokerNo(){
        Collections.shuffle(pokerNum);
//        System.out.println(pokerNum);
    }

    //发牌
    private void play(){
        for (int i = 0; i < pokerNum.size() - 3; i++){
            switch (i%3){
                case 0:
                    playNo1.add(pokerNum.get(i));
                    break;
                case 1:
                    playNo2.add(pokerNum.get(i));
                    break;
                case 2:
                    playNo3.add(pokerNum.get(i));
                    break;
            }
        }
        playNo4.add(pokerNum.get(pokerNum.size() - 3));
        playNo4.add(pokerNum.get(pokerNum.size() - 2));
        playNo4.add(pokerNum.get(pokerNum.size() - 1));

        //排序
        Collections.sort(playNo1);
        Collections.sort(playNo2);
        Collections.sort(playNo3);
        Collections.sort(playNo4);

//        System.out.println(playNo1);
//        System.out.println(playNo2);
//        System.out.println(playNo3);
//        System.out.println(playNo4);
    }

    //输出牌
    public void playPoker(){
        play();
        System.out.print("玩家一：");
        bianLi(playNo1);
        System.out.print("玩家二：");
        bianLi(playNo2);
        System.out.print("玩家三：");
        bianLi(playNo3);
        System.out.print("底  牌：");
        bianLi(playNo4);
    }

    //遍历牌
    private void bianLi(ArrayList<Integer> al){
        for (Integer i : al) {
            System.out.print(pokerMap.get(i) + "\t");
        }
        System.out.println();
    }

}
