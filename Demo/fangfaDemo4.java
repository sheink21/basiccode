package com.itheima.Demo;

public class fangfaDemo4 {
    public static void main(String[] args) {
        //需求：设计一个方法用于数组遍历，要求遍历的结果在一行上。例如：[11,22,33,44,55]

        //1.定义数组
        int[] arr = {11,22,33,44};
        //调用方法遍历数组
        printArr(arr);


    }
    //定义方法用于数组遍历
    //1.我要干嘛？   遍历数组
    //2.我干这件事情需要什么才能完成？  数组
    //3.方法的调用是否需要继续使用结果？   不需要返回值
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

}