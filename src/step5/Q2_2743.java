package step5;

import java.io.*;

public class Q2_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int length = input.length();
        sb.append(length);
        bw.write(sb.toString());
        bw.close();

    }
}
