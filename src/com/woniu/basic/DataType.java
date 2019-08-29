/*数字的倒序输出*/
package com.woniu.basic;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据:");
        int number = sc.nextInt();
        reverseNumber(number);
        sequence(number);
    }

    //逆序排列
    public static void reverseNumber(int number) {
        while (number > 0) {
            int temp = number % 10;
            System.out.println(temp);
            number = number / 10;
        }
        System.out.println("------------------");
    }
/*
*   正序获取数字的各位数
*   比如:3456
*   3456 / 1000 % 10 = 3;
*   3456 / 100 % 10 = 4;
*   3456 / 10 % 10 = 5;
*   3456 / 1 % 10 = 6;
* */
    //正序排列
    public static void sequence(int number) {
        int count = 0;
        int temp = 1;
        int newnumber = number;
        while (newnumber > 0) {
            newnumber /= 10;
            count++;
        }
        for (int i = 1; i < count; i++) {
            temp = 10 * temp;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(number / temp % 10);
            temp = temp / 10;
        }
    }
}
