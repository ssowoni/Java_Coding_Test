package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5_11720_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        /**
         * toCharArray()는 string 형의 문자열을 char 문자로 쪼개서
         * 배열에 하나씩 저장한다. 예를들어 123이 들어가면 [1,2,3] 이렇게.
         */
        char[] arr = input.toCharArray();
        int sum  = 0 ;
        for(int i =0; i<N;i++){
            sum += Character.getNumericValue(arr[i]);
        }
        System.out.println(sum);


    }
}
