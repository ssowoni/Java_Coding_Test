package step5;

import java.io.*;

public class Q1_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i-1));


     /*   char S [] = new char[1000];
        S = r.readLine().toCharArray();

        int i = Integer.parseInt(r.readLine());

        System.out.println(S[i-1]);*/

    }
}
