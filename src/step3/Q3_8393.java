package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=1; i<=input; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
