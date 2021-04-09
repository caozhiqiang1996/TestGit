package day02;

public class demo20 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100000; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp += 1;
                }
            }
            if (temp <= 2) {
                System.out.println(i);
            }
        }
    }
}
