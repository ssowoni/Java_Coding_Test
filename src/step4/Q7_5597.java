package step4;

import java.io.*;
import java.util.Arrays;

public class Q7_5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] submitArr = new int[10];
        int[] student = new int[12];
      /* int num=1;
       Arrays.fill(arr,num++);*/
        //학생 배열 값 초기화.
        for (int i = 0; i < student.length; i++) {
            student[i] = i + 1;
        }
        /**
         * 사용자가 입력한 값으로 배열이 초기화됨.
         * 즉) 과제를 제출한 학생들.
         */
        for (int i = 0; i < submitArr.length; i++) {
            submitArr[i] = Integer.parseInt(br.readLine());
        }


        Arrays.sort(submitArr);

        /*for (int i = 0; i < submitArr.length; i++) {
            for (int j =i; j < student.length; j++) {
                if (submitArr[i] == student[j]) {
                    break;
                } else {
                    sb.append(student[j]);
                }
            }
        }*/

        for (int i=0; i<student.length; i++){
            if (submitArr[i] != student[i]) {
                sb.append(student[i]);
            }
        }


//        bw.write(Arrays.toString(submitArr));

            /**
             * break는 해당 if문만 종료시키지만, return은 해당 메소드가 호출된 곳까지 종료시킨다.
             * 즉, if문을 포함한 메소드 자체를 종료시킨다.
             */
   /*     for(int i=0; i<30; i++){
            if(submitArr[i] == i+1){
                //return;
                break;
            }else{
                sb.append(i+1);
                i--;
            }
        }*/

            bw.write(sb + "\n");
            bw.close();
    /*    bw.write(Arrays.toString(submitArr));
        bw.close();
*/



    }
}