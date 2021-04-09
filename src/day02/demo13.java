package day02;

import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        System.out.println("请输入2个正整数");
        Scanner scan =new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int min =(a<b)? a: b;
        int max =(a>b)? a: b;
        for (int i = min; i >=1 ; i--) {
            if (a%i==0 && b%i ==0){
                System.out.println("最大公约数"+i);
                break;
            }
        }
        for (int j = max;j >=1;j++){
            if(j%a==0&&j%b==0){
                System.out.println("最小公倍数"+j);
                break;
            }
        }

    }
}
