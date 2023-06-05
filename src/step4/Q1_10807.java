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
            //array[i] = Integer.parsInt(st.nextToken());
        }

        Integer target = Integer.parseInt(br.readLine());

        /**
         * 확장 for문을 사용하게 되면,
         * 만약 1 4 1 2 4 2 4 2 3 4 4를 입력받았을 때
         * 1번쨰 있는 값 4
         * 4번째 있는 값 4
         * 1번째 있는 값 4
         * 2반째 있는 값 1
         * 4번째 있는 값 4
         * 이런식으로 늘어나게 된다.
          */
       //for(int i : list){
        for(int i=0; i<list.size(); i++){
            // target == arr[i]
            if(list.get(i).equals(target)){
                count++;
            }
        }
//        bw.write(list.toString());
        bw.write(Integer.toString(count));
        bw.close();


    }
}
