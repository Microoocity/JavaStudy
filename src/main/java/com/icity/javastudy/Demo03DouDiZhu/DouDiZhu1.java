package com.icity.javastudy.Demo03DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1.准备牌
2.洗牌
3.发牌
4.看牌
 */
public class DouDiZhu1 {
    /*
    1.准备牌。
    定义一个存储54张牌的ArrayList集合，泛型使用String
     */
    private static ArrayList<String> poker = new ArrayList<>();
    //    定义2个数组，一个数组存储牌的花色，一个存储牌的序号？
//    二维数组？
    private static String colors[] = {"♣梅花", "♥桃心", "♦方块", "♠黑桃"};
    private static String numbers[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public static void main(String[] args) {

        //先把大小王存储至poker集合中
        add(poker, "大王");
        add(poker, "小王");
        //循环遍历2个集合，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
//                System.out.println(color + number + " ");
                //把组装好的poker存储到集合中
                add(poker, color + number);
            }
        }

        shuffle(poker);
        fapai(poker);
        kanpai();

    }

    private static void add(List<String> List, String data) {
//        if (data != null)
        List.add(data);
    }

    //    2.洗牌：使用Collection中的shuffle(List<?> list)方法，默认随机牌对列表进行替换
    private static void shuffle(List<String> List) {
        Collections.shuffle(List);
    }

    //    3.发牌：定义4个集合存储玩家的牌和底牌
    private static ArrayList<String> player01 = new ArrayList<>();
    private static ArrayList<String> player02 = new ArrayList<>();
    private static ArrayList<String> player03 = new ArrayList<>();
    private static ArrayList<String> dipai = new ArrayList<>();

    private static void fapai(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else switch (i % 3) {
                case 0:
                    player01.add(p);
                    break;
                case 1:
                    player02.add(p);
                    break;
                case 2:
                    player03.add(p);
                    break;
            }
        }
    }

    //4.看牌
    private static void kanpai(){
        System.out.println("player01:"+player01);
        System.out.println("player02:"+player02);
        System.out.println("player03:"+player03);
        System.out.println("底牌:"+dipai);
    }

}
