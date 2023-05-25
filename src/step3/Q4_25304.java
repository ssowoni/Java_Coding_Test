package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());
        int calculPrice=0;

        //한줄씩 읽어오는데 띄어쓰기를 기준으로, 앞에는 가격 뒤에는 수량.
        for(int i=0; i<totalCount; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine()," ");//공백으로 값을 읽어와라.
            //★ 지역변수로 할 수 있는 건 지역변수로 하자.
            int itemPrice = Integer.parseInt(tokenizer.nextToken());
            int itemCount = Integer.parseInt(tokenizer.nextToken());
            //  sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            calculPrice += (itemPrice * itemCount);

        }

        if(calculPrice == totalPrice){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




    }
}
