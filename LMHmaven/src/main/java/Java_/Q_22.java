package Java_;

import java.util.Scanner;

/* Problem Number : 10950
 * Problem Name   : A+B - 3
 */
public class Q_22 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i=1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
	