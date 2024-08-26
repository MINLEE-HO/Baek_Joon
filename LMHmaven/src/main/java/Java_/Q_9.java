package Java_;

import java.util.Scanner;

/* Problem Number : 10430
 * Problem Name   : 나머지
 */
public class Q_9 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
