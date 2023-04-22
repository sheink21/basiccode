package com.itheima.homework;

import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
       /*
        1.

        int father = 177;
        int mather = 165;
        System.out.println("儿子身高" + (father + mather)*1.08 / 2);
        System.out.println("女儿身高" + (father*0.923 + mather) / 2);

        结果：
        儿子身高184.68
        女儿身高164.1855
        */

        /*
        2.

        int red = 21;
        int green = 24;
        if(red*2 + 3 == green*2) {
            System.out.println("红茶和绿茶现在的钱一样多");
        }else{
            System.out.println("红茶和绿茶现在的钱不一样");
        }
        结果：
        红茶和绿茶现在的钱不一样
         */


        /*
        或者:

        int red1 = 21;
        int green1 = 24;
        int red2 = red1*2 + 3;
        int green2 = green1*2;
        String result = red1*2 + 3 > green1*2 ? "红茶和绿茶现在的钱一样多" : "红茶和绿茶现在的钱不一样";
        System.out.println(result);
         结果：
        红茶和绿茶现在的钱不一样
         */

        /*
        3.

        int fish = 24;
        int peanut = 8;
        int rice = 3;
        double way1 = (fish + peanut + rice)*0.8;
        double way2 = fish-8 + peanut + rice;
        if(way1 > way2){
            System.out.println("可选折扣" + way1 + "元");
        }else{
            System.out.println("可选优惠价" + way2+ "元");
        }

        答案做法：

         double money1 = 24 + 8 + 3;
         double money1 = 24 + 8 + 3;
         double money1 = 24 + 8 + 3;
         double money = money1 < money2 ? money1 : money2;
         System.out.println(money);

         */

        /*
        或者：

        int fish = 24;
        int peanut = 8;
        int rice = 3;
        double way1 = (fish + peanut + rice)*0.8;
        double way2 = fish-8 + peanut + rice;
        double result = way1 > way2 ? way1 : way2;
        System.out.println(result);


         */

        /*
        4.
        2.4.0
         */

        /*
        5.
        TomasZhang
         */

       /*
       6.

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number1 == 6 || number1 +(number1 + number2) / 6 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        */

        /*
        7.

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10; //答案做法：int bai = number / 100 % 10;
        int sum = ge + shi + bai;
        System.out.println(sum);

        //验证：
        //System.out.println(ge);
        //System.out.println(shi);
        //System.out.println(bai);

         */

    }

}
