package com.itheima.homework;

import java.util.Scanner;

public class day04 {
    public static void main(String[] args) {
        //  一、if判断语句作业
        /*
        1.

        int way1 = 7988 - 1500;
        double way2 = 7988*0.8;
        if(way1 > way2){
            System.out.println("不要以旧换新");
        }else{
            System.out.println("以旧换新");
        }

        结果：
        不要以旧换新
         */

        /*
        2.

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int result1 = number1 < number2 ? number1 : number2;
        int min = result1 < number3 ? result1 : number3;
        System.out.println(min);

         */

        /*
       //使用if嵌套：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
         */


        //改正：
        /*
        if(number1 < number2 && number1 < number3){
            System.out.println(number1);
        }else if(number2 <number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }

         */

        //错误：
        /*

        if(number1 < number2){
            System.out.println(number1);
        }else if(number2 < number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }
         */

        /*
        3.

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额");
        double count = sc.nextInt();
        System.out.println("请输入存款年限");
        int year = sc.nextInt();
        switch(year){
            case 1:
                System.out.println("本息总额为" + count*2.25*year/100 + count);
                break;
            case 2:
                System.out.println("本息总额为" + count*2.7*year/100 + count);
                break;
            case 3:
                System.out.println("本息总额为" + count*3.25*year/100 + count);
                break;
            case 5:
                System.out.println("本息总额为" + count*3.6*year/100 + count);
                break;
            default :
                System.out.println("没有这个选项");
                break;

        }

         */

        /*
        或者：
         使用if嵌套

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所需要存的金额");
        double count = sc.nextInt();
        int year = sc.nextInt();
        if(year == 1){
            System.out.println("本息总额为" + count*2.25*year + count);
        }else if(year == 2){
            System.out.println("本息总额为" + count*2.7*year + count);
        }else if(year == 3){
            System.out.println("本息总额为" + count*3.25*year + count);
        }else if(year == 5){
            System.out.println("本息总额为" + count*3.6*year + count);
        }

         */

        /*
        4.

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客的类别 0 普通顾客 1 会员 ");
        int customer = sc.nextInt();
        System.out.println("请输入购物折钱金额");
        int money = sc.nextInt();
        if(customer == 0 && money >= 100){
            System.out.println(money*0.9);
        }else if(customer == 1 && money > 0 && money < 200){
        //else if(customer == 1 && money < 200)      //缺点若是money < 0 呢
            System.out.println(money*0.8);
        }else if(customer == 1 && money >= 200){
            System.out.println(money*0.75);
        }else{
            System.out.println("没有此种优惠");
        }

        //答案做法：

        // 1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 2.调用方法获取键盘录入的顾客类别和购物金额
        System.out.println("请输入顾客类别（0表示普通顾客，1表示会员顾客）：");
        int type = sc.nextInt();
        System.out.println("请输入购物金额：");
        int money = sc.nextInt();
        // 3.先判断顾客类别
        if (type == 0) {
            // 3.1.普通顾客，再判断购物金额
            if (money > 0 && money < 100) {
                System.out.println("您的应付金额为：" + money);
            } else if (money >= 100) {
                System.out.println("您的应付金额为：" + money * 0.9);
            } else {
                System.out.println("您输入的金额有误");
            }
        } else if (type == 1) {
            // 3.2.会员顾客，再判断购物金额
            if (money > 0 && money < 200) {
                System.out.println("您的应付金额为：" + money * 0.8);
            } else if (money >= 200) {
                System.out.println("您的应付金额为：" + money * 0.75);
            } else {
                System.out.println("您输入的金额有误");
            }
        } else {
            System.out.println("您输入的顾客类别有误");
        }
         */

       //5.
        //运行不出结果

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前金额");
        double money1 = sc.nextInt();
        double money2 = money1 - money1*0.1 - 5000;
        if( money1*0.1 >= 5000 ){
           //应该放在if前面定义
            if(money2 <= 3000) {
                System.out.println("税后工资为" + money2 * 0.03);
            }else if(money2 > 3000 && (money2 - 3000) <= 12000){
                System.out.println("税后工资为" + 3000 * 0.03 + (money2 - 3000)*0.1);
            }else if((money2 - 12000) > 12000 && (money2 - 25000) <= 25000){
                System.out.println("税后工资为" + 3000 * 0.03 + (money2 - 3000)*0.1 + (money2 - (money2 - 12000)*0.2));
            }else if((money2 - 25000) > 25000 && (money2 - 25000) <= 35000){
                System.out.println("税后工资为" + 3000 * 0.03 + (money2 - 3000)*0.1 + (money2 - (money2 - 12000)*0.2) + (money2 - 25000)*0.25);
            }else if((money2 - 35000) > 35000 && (money2 - 35000) <= 55000){
                System.out.println("税后工资为" + 3000 * 0.03 + (money2 - 3000)*0.1 + (money2 - (money2 - 12000)*0.2) + (money2 - 25000)*0.25 + (money2 - 35000)*0.3);
            }else if((money2 - 55000) > 55000 && (money2 - 55000) <= 80000){
                System.out.println("税后工资为" + 3000 * 0.03 + (money2 - 3000)*0.1 + (money2 - (money2 - 12000)*0.2) + (money2 - 25000)*0.25 + (money2 - 35000)*0.3 + (money2 - 55000)*0.35);
            }else if((money2 - 80000) > 80000){
                System.out.println("税后工资为" + 3000 * 0.03 + (money2 - 3000)*0.1 + (money2 - (money2 - 12000)*0.2) + (money2 - 25000)*0.25 + (money2 - 35000)*0.3 + (money2 - 55000)*0.35 + (money2 - 80000)*0.45);
        }

        }

         */


        //答案：
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的税前工资");
        //1.键盘录入税前工资
        int money = sc.nextInt();
        //2.计算应纳税部分的工资
        double before = money - (money*0.1) - 5000;
        //3.定义个税变量
        double shui = 0;
        //4.按照梯度范围计算个税数值
        if(before > 0 && before <= 3000){
            shui = before*0.03;
        }else if(before > 3000 && before <= 12000){
            shui = 3000*0.03 + (before - 3000)*0.1;
        }else if(before > 12000 && before <= 25000){
            shui = 3000*0.03 + 9000*0.1 + (before - 12000)*0.2;
        }else if(before > 25000 && before <= 35000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + (before - 25000)*0.25;
        }else if(before > 35000 && before <= 55000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (before - 35000)*0.3;
        } else if(before > 55000 && before <= 80000) {
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (before - 55000)*0.35;
        }else if(before > 80000){
            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (before - 80000)*0.45;
        }
        //5.计算税后工资
        double after = money - (money*0.1) - shui;
        //6.打印个税和税后工资
        System.out.println("个人所得税" + shui + "元");
        System.out.println("税后工资" + after + "元");

         */

        //switch选择语句作业


        /*
        1.
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println("请输入运算类型 加法：1 减法：2 乘法：3 除法：4");
        int way = sc.nextInt();
        if(way == 1){
            System.out.println("相加结果为" + (number1 + number2));
            //注意错误：System.out.println("相加结果为" + number1 + number2);
        }else if(way == 2){
            System.out.println("相减结果为" + (number1 - number2));
        }else if(way == 3){
            System.out.println("相乘结果为" + number1 * number2);
        }else if(way == 4){
            System.out.println("相除结果为" + number1 / number2);
        }

         */

        /*
        或者：

        使用switch语句:

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println("请输入运算类型 加法：1 减法：2 乘法：3 除法：4");
        int way = sc.nextInt();
        switch(way){
            case 1:
                System.out.println("相加结果为" + (number1 + number2));
                break;
            case 2:
                System.out.println("相减结果为" + (number1 - number2));
                break;
            case 3:
                System.out.println("相乘结果为" + number1 * number2);
                break;
            case 4:
                System.out.println("相除结果为" + number1 / number2);
                break;
            default:
                System.out.println("没有这个算法");
        }
         */

        /*
        或者：

        case新用法：

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println("请输入运算类型 加法：1 减法：2 乘法：3 除法：4");
        int way = sc.nextInt();
        switch(way){
            case 1 ->
                System.out.println("相加结果为" + (number1 + number2));

            case 2 ->
                System.out.println("相减结果为" + (number1 - number2));

            case 3->
                System.out.println("相乘结果为" + number1 * number2);

            case 4->
                System.out.println("相除结果为" + number1 / number2);

            default->
                System.out.println("没有这个算法");
        }

         */


        //三、循环语句作业

        /*
        1.

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个范围");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个范围");
        int number2 = sc.nextInt();
        int sum = 0;    //注意sum的初始位置
        */

        /*或者：
        //获取最大值和最小值
        int max = number1 > number2 ? number1 : number2;
        int min= number1 < number2 ? number1 : number2;

         */
        /*
        if(number1 > number2){
            for (int i = number2; i <= number1; i++) {
                sum = sum + i;
            }
            System.out.println("结果为" + sum); //注意输出位置不在循环里
        }else if(number1 < number2){
            for (int i = number1; i <= number2; i++) {
                sum = sum + i;
            }
            System.out.println("结果为" + sum);
        }

         */



        /*

        2.

        //分析：
        //1.录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        //统计变量
        int count = 0;
        //2.判断两个数字的大小
        if(number1 > number2){
            for (int i = number2; i <= number1; i++) {
                //3.循环得到在两个数范围内的每一个数，并统计符合条件的数，进行自增
                if(i % 3 == 0 && i % 5 == 0){
                    count++;
                    System.out.println(i);
                }
            }
        }else if(number1 < number2){
            for (int i = number1; i <= number2; i++) {
                //3.循环得到在两个数范围内的每一个数，并统计符合条件的数，进行自增
                if(i % 3 == 0 && i % 5 == 0){
                    count++;
                    System.out.println(i);
                }
            }
        }


         */
        /*
        或者：

        //获取最大值和最小值
        int max = number1 > number2 ? number1 : number2;
        int min= number1 < number2 ? number1 : number2;
		//统计个数
        int count = 0;
        for (int i = min; i <= max; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
         */
        //System.out.println(count);


       /*
       3.

       需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
          假如我有一张足够大的纸，它的厚度是0.1毫米。
          请问，我折叠多少次，可以折成珠穆朗玛峰的高度?


        //定义一个变量用来记录山峰的高度
       double height = 8844430;
       //定义一个变量用来记录纸张的初始厚度
        double paper = 0.1;
        //定义一个变量用来统计次数
        int count = 0;
        //4.循环折叠纸张，只要纸张的厚度小于山峰的高度，那么循环就继续
        //每折叠一次，统计次数就要++
        //选择while的理由：此时我们不知道循环的次数也不知道循环的范围，只知道循环的结束条件，所以用while
        while(paper < height){
            //折叠纸张
            paper = paper * 2;
            //折叠一次，++一次
            count++;
        }
        //当循环结束之后，count记录的值就是折叠次数
        System.out.println(count);

        */


        /*
        4.
        需求：给你一个整数 x 。
          如果 x 是一个回文整数，打印 true ，否则，返回 false 。
          解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
          例如，121 是回文，而 123 不是。
         */

        /*
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
        */

       /*
       5.
       需求：
            给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围）。
            将两数相除，要求不使用乘法、除法和 % 运算符。
            得到商和余数。

        */

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示被除数");
        //1.定义变量记录被除数
        int dividend = sc.nextInt();
        System.out.println("请输入一个整数表示除数");
        //2.定义变量记录除数
        int divisor = sc.nextInt();
        //3.定义一个变量用来统计相减了多少次
        int count = 0;
        //4.循环while
        //在循环中，不断地用被除数-除数
        //只要被除数是大于等于除数的，那么就一直循环
        while(dividend > divisor){
            dividend = dividend - divisor;
            //只要减一次，那么统计变量就自增一次
            count++;
        }
        //当循环结束之后dividend变量记录的就是余数
        System.out.println("余数为" + dividend);
        //当循环结束之后divisor变量记录值的就是商
        System.out.println("商为" + count);

         */

        /*
        6.
        //定义一个变量用来记录2019猪年
        int year = 2019;
        //定义一个变量用来记录某个年份与2019年的差
        int sum = 0;
        //用for循环来遍历从1949年到2019年
        for (int i = 1949; i < year; i++) {
        //计算某一年与2019年的差值
            sum = i - year;
            //判断差值是否为12的整数，从而判断出该年份是否为猪年
            if(sum % 12 == 0){
                System.out.println(i);
            }

        }

         */

        /*

        int year = 2019;
        for (int i = 1988; i <= year; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.println(i);
            }


        }

         */
    }

}

