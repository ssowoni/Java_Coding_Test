package step1;

import java.util.Scanner;

public class Q10_2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int multipl = 0;
		
		for(int i = 2; i>=0; i--) {
			
			int subB = Integer.parseInt(B.substring(i, i+1)); 
			multipl = Integer.parseInt(A) * subB;
			System.out.println(multipl);
		}
		
		System.out.println(Integer.parseInt(A) * Integer.parseInt(B));
		
		sc.close();
		
		
	}

}
