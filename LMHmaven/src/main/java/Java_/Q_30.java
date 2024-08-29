package Java_;

import java.util.Scanner;

/* Problem Number : 10952
 * Problem Name   : A+B -5
 */
public class Q_30 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
			
		}
	}
}
