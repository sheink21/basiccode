package com.itheima.Demo;

public class fangfaDemo5 {
    public static void main(String[] args) {
        //需求：定义一个方法判断数组中的某一个数是否存在，将判断结果返回给调用处
        //1.定义数组
        int[] arr = {1,2,8,12,56,89,34,67};

        //2.判断一个数字在数组中是否存在了
        boolean flag = contains(arr, 89);
        System.out.println(flag);

    }
    //1.我要干嘛？  判断数字在数组中是否存在
    //2.我干这件事情，需要什么才能完成？  数组  数字
    //3.调用处是否需要继续使用结果？  返回true  false
    public static boolean contains(int[] arr, int number){//查看89是否存在
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        //什么时候才能断定89，在数字中是不存在的？
        //当数组里面所有的数据全部比较完毕之后，才能断定
        return false;
    }
}
