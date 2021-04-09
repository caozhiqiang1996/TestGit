package day02;

public class demo22 {

    public static boolean prime(int n){
        long start = System.currentTimeMillis();
        if(n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0;i<100000;i++){
            if(demo22.prime(i)){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}