package Java_;

import java.util.Scanner;

/* Problem Number : 2753
 * Problem Name   : 윤년
 */
public class Q_16 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if ( a % 4 == 0) {
			if ( a % 400 == 0 || a % 100 != 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}
	}
}
