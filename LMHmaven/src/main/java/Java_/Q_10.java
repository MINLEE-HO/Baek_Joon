package Java_;

import java.util.Scanner;

/* Problem Number : 2588
 * Problem Name   : 곱셈
 */
public class Q_10 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		System.out.println(a*(b.charAt(2)-'0'));
		System.out.println(a*(b.charAt(1)-'0'));
		System.out.println(a*(b.charAt(0)-'0'));
		System.out.println(a*(b.charAt(2)-'0') + (a*(b.charAt(1)-'0'))*10 + (a*(b.charAt(0)-'0'))*100 );
	}
}
