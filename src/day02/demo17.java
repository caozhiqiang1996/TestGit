package day02;

import java.util.Scanner;

public class demo17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zs =0;
        int fs =0;
        while (true){
            int num = scan.nextInt();
            if(num>0){
                zs++;
            }else if (num<0){
                fs++;
            }else {
                break;
            }
        }
        System.out.println(zs);
        System.out.println(fs);
    }
}
