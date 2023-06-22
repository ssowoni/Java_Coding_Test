package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for(int j=0; j<S.length();j++){
                sb.append(String.valueOf(S.charAt(j)).repeat(R));
            }

            sb.append("\n");


            /*char [] arr = S.toCharArray();
            for(int j=0;j<arr.length;j++){
                sb.append(arr[j].repeat(R));

            }*/
        }
        System.out.println(sb);
    }
}
