package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Q6_2525 {
    public static void main(String[] args) throws IOException {
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            LocalTime now = LocalTime.now();
            int currentHour = now.getHour();
            int currentMinute = now.getMinute();
            System.out.println(currentHour + " " + currentMinute);

            int inputCookTime = Integer.parseInt(br.readLine());
            int totalCookTime = currentMinute + inputCookTime;
           // StringBuilder builder = new StringBuilder();

            if ((totalCookTime) < 60) {
                currentMinute = totalCookTime;
                //System.out.println(builder.append(currentHour).append(" ").append(currentMinute));
                System.out.println(currentHour + " " + currentMinute);


            } else {

                int plusHour = totalCookTime / 60;
                currentHour = currentHour + plusHour;
                currentMinute = totalCookTime - (60 * plusHour);
               // System.out.println(builder.append(currentHour).append(" ").append(currentMinute));
                System.out.println(currentHour + " " + currentMinute);



            }
        }
    }
}
