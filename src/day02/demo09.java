package day02;

import java.util.Scanner;

public class demo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019年的mouth");
        int mouth = scan.nextInt();
        System.out.println("请输入2019年的day");
        int day =scan.nextInt();
        int sumDays=0;
        switch (mouth){
            case 12:
                sumDays +=30;
            case 11:
                sumDays +=31;
            case 10:
                sumDays +=30;
            case 9:
                sumDays +=31;
            case 8:
                sumDays +=31;
            case 7:
                sumDays +=30;
            case 6:
                sumDays +=31;
            case 5:
                sumDays +=30;
            case 4:
                sumDays +=31;
            case 3:
                sumDays +=28;
            case 2:
                sumDays +=31;
            case 1:
                sumDays +=day;
        }
        System.out.println(sumDays);
    }
}
