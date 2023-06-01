package step3;

import java.io.*;
import java.util.StringTokenizer;

public class Q7_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        StringBuilder sb = new StringBuilder();


       /* for(int i=1; i<=count; i++){

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
//            bw.write("Case #" + count + ": " + Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            bw.write("Case #");
            bw.write(Integer.toString(i));
            bw.write(": ");
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");

        }*/

        for(int i=1; i<=count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

//        bw.write(String.valueOf(sb));
        bw.write(sb.toString());
        bw.close();
    }
}
