package day02;

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入期末成绩");
        int score =scan.nextInt();
        if(score ==100){
            System.out.println("奖励一辆BMW");
        }else if(score >80 && score<=99){
            System.out.println("奖励一台IPHONE");
        }else if(score>=60 && score<=80){
            System.out.println("奖励ipad");
        }else {
            System.out.println("没奖励了");
        }
    }
}
