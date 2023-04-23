package com.itheima.homework;

import java.util.Scanner;

public class day06 {
   /*
    1.
    public static void main(String[] args) {
        getMin();
    }
    public static void getMin(){
        double num1 = 9.32;
        double num2 = 3.54;
        double result = num1 > num2 ? num1 : num2;
        System.out.println(result);
    }

    */
    /*
    2.
   public static void main(String[] args) {
       getMax();
   }
   public static void getMax(){
       int num1 = 43;
       int num2 = 6;
       int num3 = 166;
       int num = num1 > num2 ? num1 : num2;
       int max = num > num3 ? num :num3;
       System.out.println(max);
   }

     */

    /*
    3.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        getOrder(num1, num2, num3);

    }
    public static void getOrder(int num1, int num2, int num3){
       int max1 = num1 > num2 ? num1 : num2;
       int max2 = max1 > num3 ? max1 : num3;
        int min1 = num1 < num2 ? num1 : num2;
        int min2 = min1 < num3 ? min1 : num3;
       int mid = (num1 + num2 + num3) - max2 - min2;
        System.out.println(max2 + " " + mid + " " + min2);
    }

     */

    /*
    4.不会取反
    public static void main(String[] args) {

    }
    public static void getValue(double num){
        if(num < 0){
            num
        }
    }

     */
    /*
    5.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        int sum = getWei(num);
        System.out.println(sum);

    }
    public static int getWei(int num){
        int count = 0;
        int x = num;
        while(x != 0){
            x = x / 10;
            count++;
        }
        return count;
    }

     */

    /*
    6.
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        equals(arr1,arr2);

    }
    public static void equals(int[] arr1, int[] arr2){
        boolean flag = true;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == arr2[i]){
                    flag = true;
                }else{
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }

     */
    /*
     7.

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9,23,66};
        int num = 12;
        fill(arr, num);
    }
    public static void fill(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

     */
    /*
    8.
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9,23,66};
        int num = 12;
        fill(arr,2,5,8);
    }
    public static void fill(int[] arr, int fromIndex, int toInndex, int value){
        for (int i = fromIndex; i < toInndex; i++) {
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

     */
    /*
    9.
    public static void main(String[] args) {
        int[] arr = {32,45,6,65,42,22,5};
        int newLength = 3;
        int[] brr = copyOf(arr, newLength);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
    public static int[] copyOf(int[] arr, int newLength){
        int brr[] = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }

     */

    /*
    需求：
    定义一个方法copyOfRange(int[] arr,int from, int to)
    功能：
    将数组arr中从索引from（包含from）开始，到索引to结束
    （不包含to）的元素复制到新数组中，并将新数组返回。
     */
    public static void main(String[] args) {
        int[] arr = {1,3,45,6,4,8,9,10};
        int[] crr = copyOfRange(arr,2,5);
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] brr = new int[to - from];
        for (int i = from; i < to; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
