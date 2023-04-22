package com.itheima.Demo;

public class switchDemo4 {
    public static void main(String[] args) {
        /*
          case穿透
          就是语句体中没有写break导致的。
          执行流程：
               首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配
               如果匹配上了，就会执行对应的语句体，一直遇到break或者右大括号为止
          使用场景：
          如果多个case的语句体重复了，那么我们考虑利用case穿透去简化代码
         */
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
               //break;
            case 20:
                System.out.println("number的值为20");
                break;
            case 30:
                System.out.println("number的值为30");
                break;
            default:
                System.out.println("number的值不是1，10或者20");
                break;
        }
    }
}
