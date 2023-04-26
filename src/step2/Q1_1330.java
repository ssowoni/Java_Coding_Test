package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_1330 {
    public static void main(String[] args) throws IOException {

/*        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a > b ? ">" : a < b ? "<" : "==");

    }
}
