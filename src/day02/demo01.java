package day02;/*
文档注释（Java特有）
文档注释的使用
 */

/**
 @author  czq
 @version  v1.0 我第一个程序
 */
public class demo01 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "*" + i + "=" + j*i+"\t");
            }
            System.out.println();
        }
    }
}
