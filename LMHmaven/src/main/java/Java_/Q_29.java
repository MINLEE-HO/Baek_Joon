package Java_;

import java.util.Scanner;

/* Problem Number : 2439
 * Problem Name   : 별 찍기 -2
 */
public class Q_29 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
