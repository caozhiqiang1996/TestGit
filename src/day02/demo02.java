package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class demo02 {

    //list是答案集合，对应下面每一道题得答案，有一个不满足就返回false，都满足返回true
    public static boolean bln(List<String> list) {
        if (!T1(list)) {
            return false;
        }
        if (!T2(list)) {
            return false;
        }
        if (!T3(list)) {
            return false;
        }
        if (!T4(list)) {
            return false;
        }
        if (!T5(list)) {
            return false;
        }
        if (!T6(list)) {
            return false;
        }
        if (!T7(list)) {
            return false;
        }
        if (!T8(list)) {
            return false;
        }
        if (!T9(list)) {
            return false;
        }
        if (!T10(list)) {
            return false;
        }
        return true;
    }

    //1T：这道题选啥？（A A，B B，C C，D D）。第一题写不写对程序没啥影响，根本没影响
    public static boolean T1(List<String> list) {
        String str = list.get(0);
        if (str.equals("A")) {
            boolean flag = (str.equals("A"));
            return flag;
        }
        if (str.equals("B")) {
            boolean flag = (str.equals("B"));
            return flag;
        }
        if (str.equals("C")) {
            boolean flag = (str.equals("C"));
            return flag;
        }
        if (str.equals("D")) {
            boolean flag = (str.equals("D"));
            return flag;
        }
        return false;
    }

    //2T：第5题选啥？（A C，B D，C A，D B）。写不写这道题还是没啥影响
    public static boolean T2(List<String> list) {
        String str = list.get(1);
        if (str.equals("A")) {
            //5T答案C
            String a = list.get(4);
            boolean flag = (a.equals("C"));
            return flag;
        }
        if (str.equals("B")) {
            //5T答案D
            String a = list.get(4);
            boolean flag = (a.equals("D"));
            return flag;
        }
        if (str.equals("C")) {
            //5T答案A
            String a = list.get(4);
            boolean flag = (a.equals("A"));
            return flag;
        }
        if (str.equals("D")) {
            //5T答案B
            String a = list.get(4);
            boolean flag = (a.equals("B"));
            return flag;
        }
        return false;
    }

    //3T：以下选项中哪一个与其他三个不同？（A 3，B 6，C 2，D 4）。既三个一样的，一个不一样的
    public static boolean T3(List<String> list) {
        String str = list.get(2);
        if (str.equals("A")) {
            //2T4T6T答案相同
            String a = list.get(1);
            String b = list.get(3);
            String c = list.get(5);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        if (str.equals("B")) {
            //2T3T4T答案相同
            String a = list.get(1);
            String b = list.get(2);
            String c = list.get(3);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        if (str.equals("C")) {
            //3T4T6T答案相同
            String a = list.get(2);
            String b = list.get(3);
            String c = list.get(5);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        if (str.equals("D")) {
            //2T3T6T答案相同
            String a = list.get(1);
            String b = list.get(2);
            String c = list.get(5);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        return false;
    }

    //4T：以下选项中哪两题答案相同？（A 1T5T，B 2T7T，C 1T9T, D 6T10T）。既选项中两道题答案相同
    public static boolean T4(List<String> list) {
        String str = list.get(3);
        if (str.equals("A")) {
            //1T5T答案相同
            String a = list.get(0);
            String b = list.get(4);
            boolean flag = a.equals(b);
            return flag;
        }
        if (str.equals("B")) {
            //2T7T答案相同
            String a = list.get(1);
            String b = list.get(6);
            boolean flag = a.equals(b);
            return flag;
        }
        if (str.equals("C")) {
            //1T9T答案相同
            String a = list.get(0);
            String b = list.get(8);
            boolean flag = a.equals(b);
            return flag;
        }
        if (str.equals("D")) {
            //6T10T答案相同
            String a = list.get(5);
            String b = list.get(9);
            boolean flag = a.equals(b);
            return flag;
        }
        return false;
    }

    //5T：以下哪个与本题答案相同？（A 8, B 4, C 9, D 7）。既选项与5T答案相同
    public static boolean T5(List<String> list) {
        String str = list.get(4);
        if (str.equals("A")) {
            //5T8T答案相同
            String a = list.get(4);
            String b = list.get(7);
            boolean flag = a.equals(b);
            return flag;
        }
        if (str.equals("B")) {
            //5T4T答案相同
            String a = list.get(3);
            String b = list.get(4);
            boolean flag = a.equals(b);
            return flag;
        }
        if (str.equals("C")) {
            //5T9T答案相同
            String a = list.get(4);
            String b = list.get(8);
            boolean flag = a.equals(b);
            return flag;
        }
        if (str.equals("D")) {
            //5T7T答案相同
            String a = list.get(4);
            String b = list.get(6);
            boolean flag = a.equals(b);
            return flag;
        }
        return false;
    }

    //6T：以下哪两个与8T答案相同？（A 2T4T， B 1T6T， C 3T10T， D 5T9T）。既选项和8T三个选项一样
    public static boolean T6(List<String> list) {
        String str = list.get(5);
        if (str.equals("A")) {
            //2T4T8T答案相同
            String a = list.get(1);
            String b = list.get(3);
            String c = list.get(7);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        if (str.equals("B")) {
            //1T6T8T答案相同
            String a = list.get(0);
            String b = list.get(5);
            String c = list.get(7);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        if (str.equals("C")) {
            //3T8T10T答案相同
            String a = list.get(2);
            String b = list.get(7);
            String c = list.get(9);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        if (str.equals("D")) {
            //5T8T9T答案相同
            String a = list.get(4);
            String b = list.get(7);
            String c = list.get(8);
            boolean flag = (a.equals(b) && a.equals(c) && b.equals(c));
            return flag;
        }
        return false;
    }

    //7T：10道题中最少的选项是什么？（A C, B B, C A, D D）。Collections.frequency(list, String)方法计算list中出现重复的次数
    public static boolean T7(List<String> list) {
        String str = list.get(6);
        int countA = Collections.frequency(list, "A");
        int countB = Collections.frequency(list, "B");
        int countC = Collections.frequency(list, "C");
        int countD = Collections.frequency(list, "D");
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(countA);
        arrayList.add(countB);
        arrayList.add(countC);
        arrayList.add(countD);
        int a = Collections.min(arrayList);
        if (str.equals("A")) {
            boolean flag = (a == countC);
            return flag;
        }
        if (str.equals("B")) {
            boolean flag = (a == countB);
            return flag;
        }
        if (str.equals("C")) {
            boolean flag = (a == countA);
            return flag;
        }
        if (str.equals("D")) {
            boolean flag = (a == countD);
            return flag;
        }
        return false;
    }

    //8T：以下哪个与1T答案不相邻？（A 7， B 5， C 2， D 10）。既AC与BD与AD（Math.abs（）取绝对值，indexOf是取下表索引）
    public static boolean T8(List<String> list) {
        String[] numArray = new String[]{"A", "B", "C", "D"};
        List<String> arrayList = Arrays.asList(numArray);
        String str = list.get(7);
        String STR = list.get(0);
        //两道题答案索引之差绝对值大于1
        if (str.equals("A")) {
            String asd = list.get(6);
            boolean flag = (Math.abs(arrayList.indexOf(STR) - arrayList.indexOf(asd)) > 1);
            return flag;
        }
        if (str.equals("B")) {
            String asd = list.get(4);
            boolean flag = (Math.abs(arrayList.indexOf(STR) - arrayList.indexOf(asd)) > 1);
            return flag;
        }
        if (str.equals("C")) {
            String asd = list.get(1);
            boolean flag = (Math.abs(arrayList.indexOf(STR) - arrayList.indexOf(asd)) > 1);
            return flag;
        }
        if (str.equals("D")) {
            String asd = list.get(9);
            boolean flag = (Math.abs(arrayList.indexOf(STR) - arrayList.indexOf(asd)) > 1);
            return flag;
        }
        return false;
    }

    //9T：“1T6T答案相同”与“XT5T答案相同”真假性相反，X=？（A 6， B 10，  C 2， D 9）。既  1T=6T&&XT!=5T 或  1T!=6T&&XT=5T
    public static boolean T9(List<String> list) {
        String str = list.get(8);
        String asd = list.get(0);
        String ASD = list.get(5);
        boolean flag = asd.equals(ASD);
        //flag为真，XT与5T没关系；flag为假，XT=5T
        if (str.equals("A")) {
            if (!flag) {
                String a = list.get(4);
                String b = list.get(5);
                boolean ToF = a.equals(b);
                return ToF;
            }
        }
        if (str.equals("B")) {
            if (!flag) {
                String a = list.get(4);
                String b = list.get(9);
                boolean ToF = a.equals(b);
                return ToF;
            }
        }
        if (str.equals("C")) {
            if (!flag) {
                String a = list.get(1);
                String b = list.get(4);
                boolean ToF = a.equals(b);
                return ToF;
            }
        }
        if (str.equals("D")) {
            if (!flag) {
                String a = list.get(4);
                String b = list.get(8);
                boolean ToF = a.equals(b);
                return ToF;
            }
        }
        return false;
    }

    //10T：答案中ABCD出现次数最多与最少之差？（A 3， B 2， C 4， D 1）。
    public static boolean T10(List<String> list) {
        String str = list.get(9);
        int countA = Collections.frequency(list, "A");
        int countB = Collections.frequency(list, "B");
        int countC = Collections.frequency(list, "C");
        int countD = Collections.frequency(list, "D");
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(countA);
        arrayList.add(countB);
        arrayList.add(countC);
        arrayList.add(countD);
        int a = Collections.min(arrayList);
        int b = Collections.max(arrayList);
        if (str.equals("A")) {
            boolean flag = (b - a == 3);
            return flag;
        }
        if (str.equals("B")) {
            boolean flag = (b - a == 2);
            return flag;
        }
        if (str.equals("C")) {
            boolean flag = (b - a == 4);
            return flag;
        }
        if (str.equals("D")) {
            boolean flag = (b - a == 1);
            return flag;
        }
        return false;
    }


    public static void main(String[] args) {
        //ABCD
        String[] numArray = new String[]{"A", "B", "C", "D"};
        //一个特特特特特特别特别大的循环
        String[] initArray = new String[10];
        List<String> selectList = Arrays.asList(initArray);
        for (String q : numArray) {
            selectList.set(0, q);
            for (String w : numArray) {
                selectList.set(1, w);
                for (String e : numArray) {
                    selectList.set(2, e);
                    for (String a : numArray) {
                        selectList.set(3, a);
                        for (String s : numArray) {
                            selectList.set(4, s);
                            for (String d : numArray) {
                                selectList.set(5, d);
                                for (String z : numArray) {
                                    selectList.set(6, z);
                                    for (String x : numArray) {
                                        selectList.set(7, x);
                                        for (String c : numArray) {
                                            selectList.set(8, c);
                                            for (String v : numArray) {
                                                selectList.set(9, v);
                                                boolean result = bln(selectList);
                                                if (result == true) {
                                                    System.out.println("2018刑侦科测试题答案为:" + selectList.toString());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

