package day02;

public class demo19 {
    public static void main(String[] args) {
        boolean a = true;
        long start = System.currentTimeMillis();
        for (int i = 2; i < 1000000; i++) {
            for (int j = 2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    a = false;
                    break;
                }
            }
            if (a == true){
                System.out.println(i);
            }
            a = true;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
