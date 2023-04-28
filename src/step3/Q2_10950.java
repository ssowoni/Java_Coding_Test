package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input;i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
