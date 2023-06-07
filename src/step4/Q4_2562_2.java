package step4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4_2562_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<9; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        //list
        int max = Collections.max(list);
        int index = list.indexOf(max);

        System.out.println(max);
        System.out.println(index+1);

    }
}
