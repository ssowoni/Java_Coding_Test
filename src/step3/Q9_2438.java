package step3;

import java.io.*;

public class Q9_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i =1; i<=count; i++){
           /* for(int j=1; j<=i; j++){
                bw.write("*");
            }*/
            bw.write("*".repeat(i));

            bw.write("\n");
        }

        bw.close();

    }
}
