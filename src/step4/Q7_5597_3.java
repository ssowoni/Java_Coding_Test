package step4;

import java.io.*;

public class Q7_5597_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[13];

        for(int i=0; i<10; i++){
            int input = Integer.parseInt(br.readLine());
            arr[input] = 1;
        }

        for(int i =1; i<arr.length;i++){
            if(arr[i] == 0 ){
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();



    }
}
