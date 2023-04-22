package com.itheima.Demo;

import java.util.Scanner;

public class whileDemo2HuiWen {
    public static void main(String[] args) {
        /*需求：给你一个整数 x 。
          如果 x 是一个回文整数，打印 true ，否则，返回 false 。
          解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
          例如，121 是回文，而 123 不是。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        //1.定义数字
        int x = sc.nextInt();
        //定义一个临时变量用于记录X原来的值，用于最后比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;
        //2.利用循环开始
        while(x != 0){
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取的数字拼接到最右边
            num = num *10 + ge;
        }
        //3.打印num
        System.out.println(num);//121
        System.out.println(x);//0
        //4.比较
        System.out.println(num == temp);
    }
}
