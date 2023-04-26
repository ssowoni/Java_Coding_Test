package step2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_9498 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num > 100 || num < 0) {
            System.out.println("score between 0 and 100");
        } else if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else if (num >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");

        }






        /*while (true) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            if (num > 100 || num < 0) {
                System.out.println("score between 0 and 100");
            } else if (num >= 90) {
                System.out.println("A");
                break;
            } else if (num >= 80) {
                System.out.println("B");
                break;
            } else if (num >= 70) {
                System.out.println("C");
                break;
            } else if (num >= 60) {
                System.out.println("D");
                break;
            } else {
                System.out.println("F");
                break;

            }
        }*/


    }

}


