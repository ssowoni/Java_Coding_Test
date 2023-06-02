package step4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num  = Integer.parseInt(br.readLine());
        /*int[] array = new int[count];*/
        List<Integer> list = new ArrayList<>();
        int count =0;


        StringTokenizer st = new StringTokenizer(br.readLine()," " );

        for(int i=0; i<num;i++){
            list.add(Integer.parseInt(String.valueOf(st.nextToken())));
        }

        Integer target = Integer.parseInt(br.readLine());

       // for(int i : list){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(target)){
                count++;
            }
        }
//        bw.write(list.toString());
        bw.write(Integer.toString(count));
        bw.close();


    }
}
