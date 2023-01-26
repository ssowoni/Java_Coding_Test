package step1;

import java.util.Scanner;

public class Q2_1000 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A+B);
		
		/*
		 * while(true) { if(A>0 && B<10) { System.out.print(A+B); break; }else { A =
		 * sc.nextInt(); B = sc.nextInt(); } }
		 */
		
		
		
		sc.close();
	}
}
