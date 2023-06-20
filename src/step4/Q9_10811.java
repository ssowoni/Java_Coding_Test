package step4;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 *  바구니의 총 개수 N
 *  M번 바구니의 순서를 역순으로 만든다.
 *  순서를 역순으로 바꿀 때, 역순 범위를 정하고, 그 범위 안에 들어있는 바구니의 순서를 바꾼다.
 */
public class Q9_10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        for(int i=0; i<N;i++){
            arr[i] = i+1;
        } // 1 2 3 4 5
        for(int i=0; i<M; i++){
            st =  new StringTokenizer(br.readLine()," ");
            //Arrays.sort(arr,fromIndex,toIndex) -> fromIndex값부터 toIndex-1값까지!
            Arrays.sort(arr,Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken()), Collections.reverseOrder());
        }

        /**
         * 1 2 3 4 5
         * 2 1 3 4 5
         * 2 1 4 3 5
         * 3 4 1 2 5
         *
         */
        sb.append(Arrays.toString(arr));
        bw.write(sb.toString());
        bw.close();

    }
}
