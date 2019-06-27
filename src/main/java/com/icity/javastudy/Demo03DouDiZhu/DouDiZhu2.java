package com.icity.javastudy.Demo03DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
    斗地主有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */
public class DouDiZhu2 {

    private static String colors[] = {"♣梅花", "♥桃心", "♦方块", "♠黑桃"};
    private static String numbers[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public static void main(String[] args) {
        //1.创建牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义2个集合，存储花色和牌的序号
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历2个集合，组装52张牌存至集合中
        for (String numbers : numbers) {
            for (String colors : colors) {
                poker.put(index, colors + numbers);
                pokerIndex.add(index);
                index++;
            }
        }

//        System.out.println(poker);
//        System.out.println(pokerIndex);
        /*
            2.洗牌：
                使用Collections中的方法shuffle(list)
         */
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);

        /*
            3.发牌
         */
        //定义4个集合，存储玩家牌和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历存储牌索引的list集合，获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer integer = pokerIndex.get(i);
            if (i >= 51) {
                dipai.add(integer);
            } else switch (i % 3) {
                case 0:
                    player01.add(integer);
                    break;
                case 1:
                    player02.add(integer);
                    break;
                case 2:
                    player03.add(integer);
                    break;
            }
        }

        /*
            4.排序
            使用Collections中的方法sort(list)
            默认升序排序
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);

        lookPoker("player01", poker, player01);
        lookPoker("player02", poker, player02);
        lookPoker("player03", poker, player03);
        lookPoker("dipai", poker, dipai);

    }

    /*
        5.看牌：
            查表法：
                遍历玩家或底牌的集合，获取牌的索引
                使用牌的索引，去Map集合中，找到对应的牌
     */
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        //输出玩家姓名，不换行
        System.out.print(name + ": ");
        //遍历玩家或底牌集合，获取牌的索引
        for (Integer key : list) {
            //使用牌的索引，去Map集合中，找到对应的牌
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
