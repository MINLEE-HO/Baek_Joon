package Java_;

import java.util.Scanner;

/* Problem Number : 10951
 * Problem Name   : A+B -4
 */
public class Q_31 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}
