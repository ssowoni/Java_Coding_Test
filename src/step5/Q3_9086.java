package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        /*String[] arr = new String[T];

        for(int i=0; i<arr.length; i++){
            String input = br.readLine();
            arr[i] = input.charAt(0) + String.valueOf(input.charAt(input.length() - 1));
        }

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        for(int i=0; i<T; i++){
            String input = br.readLine();
            sb.append(input.charAt(0)).append(input.charAt(input.length() - 1)).append("\n");
        }
        System.out.println(sb);


    }
}
