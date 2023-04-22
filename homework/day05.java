package com.itheima.homework;

import java.util.Random;
import java.util.Scanner;

public class day05 {
    public static void main(String[] args) {

        /*
        1.
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

         */

        /*
        2.
        double[] arr = {12.9, 53.54, 75.0, 3.14, 99.1};
        double min = 0;
        for (int i = 1; i < arr.length; i++) {
           if(arr[i] < arr[0]){
               min = arr[i];
           }
        }
        System.out.println(min);

         */

        /*
        3.
        int[] arr =  new int[6];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100);
            arr[i] = number;
            System.out.print(arr[i] + " ");
        }

         */

        /*

        int[] arr = {3, 4, 6, 8, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum * 10 + arr[i];
        }
            System.out.println(sum);

         */

        /*

        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println(average);

         */

        /*
        6.不会做
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        int[] newArr1 = getArr(arr, num1);
    }

    public static int[] getArr(int[] arr, int num) {
        //1.定义数组
        int[] newArr = new int[arr.length + 1];
        //伪造索引思想
        int index = 0;
        int max = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (max > arr[i]) {
                newArr[index] = arr[i + 1];
            }else {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;

         */

        //答案：
        //1.定义长度为10的原数组
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        //2.定义长度为11的空数组
        int[] brr = new int[11];
        //3.键盘录入数据
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        //4.定义变量代表要插入的位置
        int index = 0;
        //5.循环遍历原数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= num){
                //5.1如果元素小于等于要插入的数字，则直接存放
                brr[i] = arr[i];
                //5.2把i后面的位置记录下来
                index++;
            }else {
                //5.3如果元素大于要插入的数字，则往后一个位置存放
                brr[i+1] = arr[i];
            }
        }
        //6.index存储的就是要插入的位置
        brr[index] = num;
        //7.遍历新数组查看结果
        System.out.println("生成的新数组是：");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
