package step4;

import java.io.*;
import java.util.StringTokenizer;

/**
 *  바구니 개수 : N
 *  공은 1개씩 들어있고, 처음 공의 번호는 바구니와 같은 번호
 *  M번 공을 바꾸려고 한다, 바구니 2개를 선택해서 두 바구니에 공을 교환한다.
 */
public class Q6_10813 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N  = Integer.parseInt(st.nextToken()); //바구니 개수
        int M = Integer.parseInt(st.nextToken()); //공은 바꿀 횟수
        int [] basket = new int[N];
        //바구니의 번호에 해당하는 공 넣기
        for(int i=1;i<=basket.length;i++){
            basket[i-1] = i;
        }


        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int temp = 0;
            int j = Integer.parseInt(st.nextToken())-1;
            int k = Integer.parseInt(st.nextToken())-1;

            temp = basket[j];
            basket[j]=basket[k];
            basket[k]=temp;
        }

        for(int i :basket){
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.close();




    }
}
