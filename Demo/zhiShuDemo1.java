package com.itheima.Demo;

import java.util.Scanner;

public class zhiShuDemo1 {
    public static void main(String[] args) {
        //需求:键盘录入一个正整数x，判断该整数是否为一个质数。
        //分析：
        //1.键盘录入一个正整数
        //number
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true：是一个质数
        //false：不是一个质数

        //表示最初就认为number是一个质数
        boolean flag = true;

        //2.判断
        //写一个循环，从2开始判断，一直判断到number-1为止
        //看这个范围之内，有没有数字可以被number整除
        for (int i = 2; i < number; i++) {
            //i依次表示这个范围之内的每一个数字
            //看number是否能被i整除就可以了
            if(number%i==0) {
                flag = false;
                break;
            }
        }
        //只有当这个循环结束了，表示这个范围之内所有的数字都判断完毕了
        //此时才能断定number是一个质数
        if(flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number +"不是一个质数");
        }
    }
}
