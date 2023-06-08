package step4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q7_5597_2 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<Integer> student = new LinkedList<>();
        List<Integer> submitS = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            student.add(i);
        }

        for (int i = 0; i < 10; i++) {
             submitS.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(submitS);
        /*Collections.sort(submitS);
        System.out.println(student);
        System.out.println(submitS);*/

        for(int i=0; i<submitS.size(); i++){
            if(submitS.get(i) == student.get(i)){
                //sb.append(student.get(i)).append("\n");
                student.remove(i);
            }
        }

        for(int i : student){
            sb.append(i).append("\n");
        }
        bw.write(sb.toString());
        bw.close();


    }
}
