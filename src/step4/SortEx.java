package step4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortEx {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        Integer[] arr2 = {1, 2, 3, 4, 5};

        Arrays.sort(arr2,0,3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));

    }
}
