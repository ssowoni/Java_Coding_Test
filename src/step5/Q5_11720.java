package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum=0;
        for(int i=0; i<N; i++){
           /**
           아스키 코드에 따라 char 형의 문자열을 int 타입으로 바꾸면
           char 형의 1은 49
           char 형의 A는 65가 되는
           int num = input.charAt(i);
           */
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            sum += num;
        }

        System.out.println(sum);

    }
}
