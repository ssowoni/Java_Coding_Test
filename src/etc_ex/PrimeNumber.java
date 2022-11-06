package etc_ex;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        isPrime(sc.nextInt());
    }



    public static void isPrime(int number){

        if(number <2){
            System.out.println(number+"은 소수가 아닙니다.");
            return;
        }

        if(number ==2){
            System.out.println(number+"소수 입니다.");
        }

        for(int i=2; i<number; i++){
            if(number%i==0){
                System.out.println(number+"은 소수가 아닙니다.");
                return;
            }
        }
        System.out.println(number+"은 소수 입니다. ");
        return;

    }
}
