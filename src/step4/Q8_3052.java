package step4;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q8_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*Integer[] arr = new Integer[10]; // 크기가 10인 배열 생성

        for(int i=0; i<10; i++){
            int input = Integer.parseInt(br.readLine());
            arr[i] = input %42;
        }

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr)); //중복을 제거해서 저장함.*/

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<10; i++){
            int input = Integer.parseInt(br.readLine());
            //자동으로 형변환 돼서 int형 변수 input이 Integer로 들어간 것?
            set.add(input%42);
//            set.add(Integer.valueOf(br.readLine()) % 42);
        }

        sb.append(set.size());
        bw.write(sb.toString());
        bw.close();
    }
}
