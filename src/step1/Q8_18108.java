package step1;

import java.io.IOException;
import java.util.Scanner;

public class Q8_18108 {

	public static void main(String[] args) throws IOException{
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int year = br.read();
//		System.out.println(year-553);

		System.out.println("불기연도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("서기연도 : " + (year-543));
	}

}
