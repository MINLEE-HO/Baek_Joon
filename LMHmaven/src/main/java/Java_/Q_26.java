package Java_;

import java.util.Scanner;

/* Problem Number : 11021
 * Problem Name   : A+B -7
 */
public class Q_26 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d\n",i,a+b);
		}
		
	}
}
