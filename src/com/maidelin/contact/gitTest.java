package com.maidelin.contact;

import java.util.Scanner;

public class gitTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[][] good = new int[a][a];
        if (a % 2 != 0) {
                for (int j = 0; j < a; j++) {
                    good[0][j] = j+1;
                }
                for (int i = 1;i<=a ;i++){
                    good[i][a-1] = good[0][a-1] +1;
                }
        }
        for (int i = 0; i < good.length; i++) {
            for (int j = 0; j < good[i].length; j++) {
                System.out.print(good[i][j] + " ");
            }
            System.out.println();
        }
    }
}
