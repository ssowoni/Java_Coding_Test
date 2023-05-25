package step3;

import java.io.*;

public class Q5_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = (Integer.parseInt(br.readLine()))/4;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append("long").append(" ");
        }
       /* sb.append("int");
        System.out.println(sb);*/
        sb.append("int");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        //bw.write()는 파라미터로 StringBuilder를 받을 수 없다.
        bw.write(sb.toString());
        bw.close();


    }
}
