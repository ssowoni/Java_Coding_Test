package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_9439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
          for(int i=1; i<=count;i++){
              sb.append(" ".repeat(count-i)).append("*".repeat(i)).append("\n");
          }

        System.out.println(sb);

    }
}
