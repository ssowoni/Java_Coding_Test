package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        for(int i=1; i<=9;i++){
            System.out.println(input + " * " + i + " = " + (input*i));
        }

        /*StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<10; i++){
            sb.append(N).append(" * ").append(i).append(" = ").append(N*i).append("\n");
        }*/

    }
}
