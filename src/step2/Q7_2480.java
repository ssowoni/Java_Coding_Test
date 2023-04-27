package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7_2480 {
    public static void main(String[] args) throws IOException {
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int prize = 0;

            if (a == b && a == c && b == c) {
                prize = 10000 + (a * 1000);
            } else if (a == b || a == c || b == c) {
                prize = 1000 + (samNum(a, b, c) * 100);
            } else {
                prize = maxNum(a, b, c) * 100;
            }

            System.out.println(prize);
        }
    }

    public static int maxNum(int a, int b,int c){
        int maxNum = 0;
        maxNum = a>b?a:b;
        maxNum = maxNum>c?maxNum:c;
        return  maxNum;
    }

    public static int samNum(int a, int b, int c){
        int sameNum = 0;
        if(a==b || a==c){
            sameNum =  a;
        }else if(b==c){
            sameNum= c;
        }
        return sameNum;
    }

}
