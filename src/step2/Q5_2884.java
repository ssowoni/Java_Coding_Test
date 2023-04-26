package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_2884 {
    private static final int MAX_HOUR = 24;
    private static final int MAX_MINUTE = 60;
    private static final int MIN_HOUR = 0;
    private static final int MIN_MINUTE = 0;

    public static void main(String[] args) throws IOException {

        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int h = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            int time = m - 45;

            if (time > 0) {
                System.out.print(h);
                System.out.print(time);
            } else {
                if (h <= 1) {
                    h = MAX_HOUR - 1;
                } else {
                    h = h - 1;
                }
                m = MAX_MINUTE + time;

                System.out.print(h);
                System.out.print(m);
            }

        }


    }


}
