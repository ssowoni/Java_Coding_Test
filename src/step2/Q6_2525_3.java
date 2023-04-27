package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_2525_3 {
    public static void main(String[] args) throws IOException {
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int currentHour = Integer.parseInt(st.nextToken());
            int currentMinute = Integer.parseInt(st.nextToken());

            int inputCookTime = Integer.parseInt(br.readLine());

            int totalMinute = (currentHour * 60) + currentMinute;
            totalMinute += inputCookTime;


            int ovenHour = (totalMinute / 60) % 24;
            int ovenMinute = totalMinute % 60;
            System.out.println(ovenHour + " " + ovenMinute);
        }


    }
}
