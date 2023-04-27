package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_2525_2 {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int currentHour = Integer.parseInt(st.nextToken());
            int currentMinute = Integer.parseInt(st.nextToken());

            int inputCookTime = Integer.parseInt(br.readLine());

            int cookHour = (inputCookTime / 60);
            int cookMinute = inputCookTime % 60;

            int totalHour = (currentHour + cookHour)%24;
            int totalMinute = currentMinute+ cookMinute;

            if(totalMinute <60){
                System.out.println(totalHour + " " + totalMinute);
            }else{
                totalMinute = totalMinute -60;
                totalHour = totalHour +1;
                System.out.println(totalHour + " " + totalMinute);

            }





        }

    }
}
