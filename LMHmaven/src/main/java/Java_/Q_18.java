package Java_;

import java.util.Scanner;

/* Problem Number : 2884
 * Problem Name   : 알람시계
 */
public class Q_18 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int m = sc.nextInt();
		
		if ( m >= 44 ) {
			System.out.print(H + " ");
			System.out.print(m+15);
		} else if ( m < 45 && H > 0 ){
			System.out.print(H-1 + " ");
			System.out.print(m+15);
		} else {
			System.out.print(23 + " ");
			System.out.print(m+15);
		}
	}
}
