package com.maidelin.contact;

public class demo05 {
    public static void main(String[] args) {
        String[] str = new String[]{"AA", "BB", "CC", "DD", "EE"};
        String[] str2 = new String[str.length];
        for (int i = 0; i < str2.length; i++) {
            str2[i] = str[i];
        }

        for (int i = 0; i < str.length / 2; i++) {
            String temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }

        for (String a : str
        ) {
            System.out.print(a + "\t");
        }

        String str3 = "QQ";
        System.out.println();
        boolean isflag = true;
        for (int i = 0; i < str.length; i++) {
            if (str3.equals(str[i])) {
                System.out.println("找到了指定的元素：位置为" + i);
                isflag = false;
                break;
            }
        }
        if (isflag) {
            System.out.println("没找到");
        }
    }
}
