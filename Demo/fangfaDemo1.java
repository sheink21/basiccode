package com.itheima.Demo;

public class fangfaDemo1 {
   /* public static void main(String[] args) {

        //目标：；利用方法最简单的格式完成当前练习

        //调用方法
        printGFInfo();
    }
    public static void  printGFInfo(){
        System.out.println("小小");
        }
    }
    */

 /*
        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印

        //目标：根据不同的需求，选择定义无参的方法，还是带参的方法
   public static void main(String[] args) {
       getlength(5.2, 1.3);
   }



    //1.我要干嘛？ 求长方形的周长
    //2.我干这件事情，需要什么才能完成？长 宽
    public static void getlength(double len, double width){
        double result = (len + width)*2;
        System.out.println(result);
    }

  */
    //需求：定义一个方法，求圆的面积，将结果在方法中进行打印
    //目标：根据不同的需求，选择定义无参的方法，还是带参的方法

    public static void main(String[] args) {
        getArea(1.5);
    }
    public static void  getArea(double radius){
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}
