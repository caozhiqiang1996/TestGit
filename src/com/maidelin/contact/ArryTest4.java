package com.maidelin.contact;

public class ArryTest4 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int a: array1) {
            System.out.print(a + "\t");
        }
        int[] array2 =array1;
        for (int i =0;i<array2.length;i++){
            if(i % 2 ==0){
                array2[i] = i;
            }
        }
        System.out.println();
        for (int b : array1) {
            System.out.print(b + "\t");
        }
    }
}
