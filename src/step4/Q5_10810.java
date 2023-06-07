package step4;

import java.io.*;
import java.util.StringTokenizer;

/**
 *  바구니 총 개수 : N
 *  공 : 1번부터 N번 까지
 *  공을 넣는 횟수 : M
 *  바구니에 공은 1개만 넣을 수 있다.
 *  이미 공이 있는 경우 들어있는 공을 빼고, 새 공을 넣는다.
 */

public class Q5_10810 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int basketN = Integer.parseInt(st.nextToken());
        int ballTimes  = Integer.parseInt(st.nextToken());
        //int형 배열의 초기값은 0으로 할당된다.
        //따라서 공이 없는 경우를 따로 0으로 초기화시킬 필요는 없다.
        int[] basketInBall = new int[basketN];

        for(int i=0; i<ballTimes; i++){
            st = new StringTokenizer(br.readLine()," ");
            int startN = Integer.parseInt(st.nextToken());
            int endN =  Integer.parseInt(st.nextToken());
            int ballN =  Integer.parseInt(st.nextToken());

            for(int j= startN; j<=endN; j++ ){
                basketInBall[j-1] = ballN;
            }
        }
        //bw.write();

        for(int allBall : basketInBall){
            //System.out.println(sb.toString().strip()); strip()은 공백 문자 제거
            bw.write(allBall+" ");

        }
        bw.close();

    }
}
