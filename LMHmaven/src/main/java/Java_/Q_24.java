package Java_;

import java.util.Scanner;

/* Problem Number : 25314
 * Problem Name   : 코딩은 체육과목 입니다
 */
public class Q_24 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = N/4;
		
		for (int i=0; i<t; i++) {
			System.out.print("long ");
		}
		
		System.out.println("int");
	}
}
