package step4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }


        //최대값 구하기
        double max = 0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        //점수 위조하기
        for(int i=0; i<arr.length; i++){
//            if(arr[i] < max) {
                arr[i] = arr[i] / max * 100;
//            }
        }

        bw.write(Arrays.toString(arr)+"\n");

        double sum = 0;
        //위조된 점수로 다시 평균 구하기
        for(double score : arr){
            sum += score;
        }

        /*bw.write(String.valueOf((sum*100/max/arr.length)));*/
        bw.write(String.valueOf(sum / arr.length));
        bw.close();







    }
}
