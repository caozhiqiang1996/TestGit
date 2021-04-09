package com.maidelin.contact;

public class demo02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};

        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];

        System.out.println(arr1[0][1]);
        System.out.println(arr1.length);

        for (int i = 0;i <arr1.length;i++){
            for (int j =0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
