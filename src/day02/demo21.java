package day02;

public class demo21 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        lab1:for (int i = 2; i < 1000000; i++) {
            for (int j = 2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    continue lab1;
                }
            }
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
