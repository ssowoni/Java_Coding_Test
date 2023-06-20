package step4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 *  바구니의 총 개수 N
 *  M번 바구니의 순서를 역순으로 만든다.
 *  순서를 역순으로 바꿀 때, 역순 범위를 정하고, 그 범위 안에 들어있는 바구니의 순서를 바꾼다.
 */
public class Q9_10811_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = i + 1;
        }

        /**
         * 1번부터 4번쨰까지 역순
         * ★ 2 1 4 3 5
         *
         * 1번 숫잦를 4번 숫자로
         * 1 2 4 3 5
         * 1 4 2 3 5
         * 1 4 3 2 5
         *
         * 2번 숫자를 3번 숫자로
         * 4 1 3 2 5
         * 4 3 1 2 5
         *
         * 3번 숫자를 2번 숫자로
         * 3 4 1 2 5
         *
         */

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken()) -1;
            int to = Integer.parseInt(st.nextToken()) -1;

            for(int j =from; j<=to;j++,to--){
                int temp = arr[j];
                arr[j] = arr[to];
                arr[to] = temp;
            }

   /*         for(int j =from; j<=to;from++,to--){
                int temp = arr[from];
                arr[from] = arr[to];
                arr[to] = temp;
            }*/


            /**
             * 1번부터 4번을 역순
             *  2 1 4 3 5
             *
             *  from&j 0, to 3,
             *  = 3 1 4 2 5
             *
             *  from&j 1, to 2
             *  = 3 4 1 2 5
             *
             *  from&j 2 to 1
             *
             *
             */
        }


        for(int i=0; i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.close();
    }
}
