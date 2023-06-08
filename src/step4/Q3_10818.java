package step4;

import java.io.*;
import java.util.StringTokenizer;

public class Q3_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //배열에 값 할당.
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[0], min = arr[0];

        for(int i =0; i<N; i++){

            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }

        /**
         * 만약 배열에 값을 할당하지 않을거면
         * 		int maxValue = -99999999;
         * 		int minValue = 999999999;
         * 	max랑 min의 임의의 수 즉)문제 조건에 나와있는 수를 할당하고.
         * 	이 maxValue와 현재 st.nextToken으로 읽고 있는 수를 비교해서 min, max값을 정한다.
         */



        sb.append(min).append(" ").append(max);
        /*sb.append(max);*/
        bw.write(sb+"\n");
        bw.close();



    }
}
