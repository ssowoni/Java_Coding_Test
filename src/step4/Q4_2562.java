package step4;

import java.io.*;

public class Q4_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int index = 0;
        for(int i=0; i<9;i++){
            int currentNum = Integer.parseInt(br.readLine());
            if(max < currentNum) {
                max = currentNum;
                index = i+1;
            }
        }

        bw.write(max + "\n" + index);
        bw.close();



    }
}
