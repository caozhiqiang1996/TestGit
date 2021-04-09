package day02;

public class demo16 {
    public static void main(String[] args) {
        int num =1;
        int count = 0;
        int sum =0;
        do{
            if (num%2==0){
                System.out.println(num);
                sum +=num;
                count++;
            }
            num++;
        }while (num<101);
        System.out.println(count);
        System.out.println(sum);
    }
}
