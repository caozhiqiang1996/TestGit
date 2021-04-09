package com.maidelin.contact;

public class demo04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0;i<arr.length;i++){
            arr[i] =(int) (Math.random()*90+10);
            }
        int max = arr[0];
        int min =arr[0];
        int sum = 0;
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j] +"\t");
            if(arr[j]>max){
                max = arr[j];
            }
            if(arr[j]<min){
                min =arr[j];
            }
            sum +=arr[j];
        }
        System.out.println();
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("和值" + sum);
        System.out.println("平均值" + (double)sum/arr.length);
    }
}
