package step4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {

        String[] str = {"십","20","삼십","40","일","2","삼"};
        List<Integer> list = Arrays.asList(1,20,31,45,521,65,7,87,95);
        //forStr은 str 배열에 담겨있는 요소의 값들이다.
        /*for(String forStr : str) {
            System.out.println(forStr);
        }*/
/*        for(Integer forStr : list){
            System.out.println(list.get(forStr));*//**//*}*/

      /*  int[] arr = {2,3,4};
        for(int i : arr){
            System.out.println(i);
        }*/
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println(intMax);
        System.out.println(intMin);

    }
}
