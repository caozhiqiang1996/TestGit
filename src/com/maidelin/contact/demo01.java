package com.maidelin.contact;


import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {

        //ʹ��Scanner��ȡѧ������
        Scanner scan = new Scanner(System.in);
        System.out.println("������ѧ��������");
        int num =scan.nextInt();

        //�������飬�洢ѧ���ɼ�����̬��ʼ��
        System.out.println("���������ѧ���ĳɼ�");
        int[] score = new int[num];

        //�������е�Ԫ�ظ�ֵ
        for (int i =0;i<score.length;i++){
            score[i] = scan.nextInt();
        }

        //��ȡ������Ԫ�ص����ֵ����߷�
        int maxScore =0;
        for (int i = 0;i< score.length;i++){
            if (maxScore < score[i]){
                maxScore = score[i];
            }
        }

        //����ÿ��ѧ���ɼ�����߷ֵĲ�ֵ���õ�ÿ��ѧ���ĵȼ���������ǼǺͳɼ�
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
