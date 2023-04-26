package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_2884_2 {
    private static final int MAX_HOUR = 24;
    private static final int MAX_MINUTE = 60;
    private static final int MIN_HOUR = 0;
    private static final int MIN_MINUTE = 0;

    public static void main(String[] args) throws IOException {

        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            String[] timeArr = str.split(" "); //" " 를 기준으로 문자열을 분리하여 배열에 저장한다.
            int h = Integer.parseInt(timeArr[0]);
            int m = Integer.parseInt(timeArr[1]);
            int time = m - 45;


            if (time >= 0) {
                System.out.print(h+" "+time);
            } else {
                if (h ==0) {
                    h = MAX_HOUR - 1;
                } else if(h>0 && h<24) {
                    h = h - 1;
                }
                m = MAX_MINUTE + time;

                System.out.print(h+ " "+m);

            }

        }


    }
    }
