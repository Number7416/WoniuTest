package com.woniu.atm;

import java.util.Scanner;

public class MainUI {
    String[] username = {"艾克","金克斯","薇"};
    String[] password = {"123","456","789"};
    int count = 0;

    public static void main(String[] args) {
        MainUI ui = new MainUI();
        ui.firstMenu();
    }

    public void firstMenu() {
        System.out.println("***********************");
        System.out.println("** 欢迎来到第八号当铺 **");
        System.out.println("***********************");
        System.out.println("请输入序号选择:1.登录 2.注册 3.查找 4.退出");
        System.out.print("请输入菜单序号:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1:
                this.doLogin();
                break;
            case 2:
                this.enrol();
                break;
            case 3:
                this.select();
                break;
            default:
                this.exitProgram();
                break;
        }

    }

    public void mainMenu() {
        System.out.println("这是主菜单.");
    }

    public void doLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String s = sc.next();
        System.out.print("请输入密码:");
        String t = sc.next();
        boolean bo = false;
        boolean o = false;
        for (int i = 0; i < username.length; i++) {
            if (s.equals(username[i])) {
                bo = true;
                if (t.equals(password[i])) {
                    o = true;
                }
                break;
            }
        }

        if (bo && o) {
            System.out.println("登陆成功.");
            this.mainMenu();
        } else {
            System.out.println("您输入的用户名或密码有误.");
            System.out.println();
            count++;
            if (count > 3) {
                System.out.println("对不起,您的错误次数太多,请稍后重试.");
                return;
            } else {
                this.firstMenu();
            }
        }
    }

    public void enrol() {

    }

    public void select() {

    }

    public void exitProgram(){

    }
}
