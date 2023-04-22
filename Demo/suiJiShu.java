package com.itheima.Demo;

import java.util.Random;
import java.util.Scanner;

public class suiJiShu {
    public static void main(String[] args) {
        //需求：程序自动生成一个1~100之间的随机数字，使用程序实现猜出这个数字是多少
        //扩展小需求：加一个保底机制，3次猜不中，直接提示猜中了
        /*注意点：
        1.生成随机数的代码   int number = r.nextInt(100) + 1;
        //不能写在循环里面，否则每一次都会产生一个新的随机数
         */
        //计数器
        //用来统计当前已经猜了多少次
        int count = 0;
        //分析
        //1.生成一个1~100之间的随机数字

        /*秘诀
        用来生成任意数之间的随机数 7~15
        1.让这个范围头尾都减去一个值，让这个范围从0开始  -7   0~8
        2.尾巴加1    8+1=9
        3.最终的结果，再加上第一步减去的值。
        例如：
        Random r = new Random();
        int number =r nextInt(9) +7;// 7~15
                  //0~8+7
        */
        Random r =new Random();
        int number = r.nextInt(100) + 1;
        //2.猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            //3.判断两个数字给出不同的提示
            //猜的数字大了，提示大了
            //猜的数字小了，提示小了
            //猜的数字一样，提示猜中了
            count ++;
            if(count==3){
                System.out.println("猜中了");
                break;}
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
