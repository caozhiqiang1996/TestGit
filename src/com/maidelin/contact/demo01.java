package com.maidelin.contact;


import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {

        //使用Scanner读取学生个数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num =scan.nextInt();

        //创建数组，存储学生成绩，动态初始化
        System.out.println("请输入各个学生的成绩");
        int[] score = new int[num];

        //给数组中的元素赋值
        for (int i =0;i<score.length;i++){
            score[i] = scan.nextInt();
        }

        //获取数组中元素的最大值：最高分
        int maxScore =0;
        for (int i = 0;i< score.length;i++){
            if (maxScore < score[i]){
                maxScore = score[i];
            }
        }

        //根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出登记和成绩
        char leval;
        for (int i =0;i<score.length;i++){
            if (maxScore - score[i] <=10){
                leval = 'A';
            }else if(maxScore - score[i] <=20){
                leval = 'B';
            }else if (maxScore - score[i] <=30){
                leval ='C';
            }else {
                leval ='D';
            }
            System.out.println("Student" + i + "score is " + score[i] + ",grade is " + leval);
        }

    }
}
