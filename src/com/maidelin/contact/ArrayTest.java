package com.maidelin.contact;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ids = new int[]{1,2,3,4,5,6,7,8,};
        for (int abb: ids) {
            System.out.println(abb);
        }
        System.out.println(ids.length);
        System.out.println(ids[0]);

        String[] names = new String[]{"曹志强","陆风刚"};

        String[] st1 = new String[9];
        st1[0] = "cao";
        //st1[1] = "cao";
        for (String bbb:st1
             ) {
            System.out.println(bbb);
            //18413820100
        }



    }
}
