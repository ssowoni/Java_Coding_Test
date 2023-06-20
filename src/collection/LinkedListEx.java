package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
     /*   LinkedList list = new LinkedList(); //타입 미설정 Object로 선언된다.
        list.addFirst(1); //가장 앞에 데이터 추가
        list.addLast(2); //가장 뒤에 데이터 추가
        list.add(3);//데이터 추가
        list.add(1, 10);//index 1에 데이터 10 추가
        System.out.println(list); //[1, 10, 2, 3]*/

        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        list.removeFirst(); //가장 앞의 데이터 제거
        list.removeLast(); //가장 뒤의 데이터 제거
        list.remove(); //인자 생략시 0번째 index 제거
        list.remove(1); //index 1 제거
        list.clear();//모든 값 제거
    }
}
