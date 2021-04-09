package day02;

import java.util.Scanner;

public class demo06 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数");
        Scanner scan =new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();
        if(a>b){
            if(c>a){
                System.out.println(b+","+a+","+c);
            }else if(c<b){
                System.out.println(c+","+b+","+a);
            }else {
                System.out.println(b+","+c+","+a);
            }
        }else {
            if(c<a){
                System.out.println(c+","+a+","+b);
            }else if(c<b){
                System.out.println(a+","+c+","+b);
            }else {
                System.out.println(a+","+b+","+c);
            }
        }
    }
}
