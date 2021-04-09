package day02;

public class demo {
    public static void main(String[] args) {
        for(int a=-10000;a<10000;a++) {
            for (int b = -10000; b < 10000;b++){
                if ((a + 1) * (b + 1) == 55) {
                    System.out.println("a="+a+";"+"b="+b);
                }
            }
        }
    }
}
