package Java_;

import java.util.Scanner;

/* Problem Number : 2438
 * Problem Name   : 별 찍기 -1
 */
public class Q_28 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		
		for (int i=1; i<=star; i++) {
			for (int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
