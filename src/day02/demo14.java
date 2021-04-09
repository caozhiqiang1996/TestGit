package day02;

public class demo14 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if ((i/100)*(i/100)*(i/100) +(i%100/10)*(i%100/10)*(i%100/10)+(i%10)*(i%10)*(i%10)==i){
                System.out.println(i);
            }
        }
    }
}
