package day02;

public class demo07 {
    public static void main(String[] args) {
        int age = 1;
        if(age>=0 && age <=2){
            System.out.println(age*5);
        }else if (age>2){
            System.out.println(2*10.5+(age-2)*4);
        }else {
            System.out.println("还没出生");
        }
    }
}
