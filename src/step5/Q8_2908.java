package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        /*String a = st.nextToken();
        String b = st.nextToken();*/

        for(int i=0; i<2; i++){
            String input = st.nextToken();
            for(int j=input.length()-1; j<=0;j--){
                input.charAt(j);
            }
        }


       /* String max = String.valueOf(Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        for(int i=max.length()-1 ; i>=0; i--){
            sb.append(max.charAt(i));
        }
        System.out.println(sb);*/



    }
}
