package step4;

import java.io.*;
import java.util.StringTokenizer;

public class Q2_10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(st.nextToken());
        //배열 선언
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");

        //값 할당, 배열 값 초기화
        //근데 굳이 배열에 넣지 않고 그냥 st.nextToken으로 읽어 온 값을 지역변수에 담아서 비교해도 된다.
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]<targetNum){
                sb.append(arr[i]).append(" ");
            }
        }


        bw.write(sb.toString());
        bw.close();




    }
}
