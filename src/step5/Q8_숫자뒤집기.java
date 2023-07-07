package step5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8_숫자뒤집기  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); //첫번째 숫자
        int b = Integer.parseInt(st.nextToken()); //두번째 숫자
        int max = 0;


        a = reverseNumber(a);
        b = reverseNumber(b);

        System.out.println(Math.max(a, b));

    }

    /**
     * 5432 % 10 = 2
     * 543  % 10 = 3
     * 54 % 10 = 4
     *
     */
    public static int reverseNumber(int inputNum){
        int reNum =0;

        for(int i=2; i>=0; i--){
            int remainNum = inputNum%10;
            reNum += (int)(remainNum * Math.pow(10, i));
            inputNum= inputNum/10;
        }


        return reNum;
    }



}
