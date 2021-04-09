package day02;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String  num = scan.next();
        System.out.println(num);

        System.out.println("请输入你的芳龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight =scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否爱我？");
        boolean sf =scan.nextBoolean();
        System.out.println(sf);
    }
}
