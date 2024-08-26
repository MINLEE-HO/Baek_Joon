package Java_;

import java.util.Scanner;

/* Problem Number : 1330
 * Problem Name   : 두 수 비교하기
 */
public class Q_14 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
