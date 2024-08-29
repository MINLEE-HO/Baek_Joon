package Java_;

import java.util.Scanner;

/* Problem Number : 2793
 * Problem Name   : 구구단
 */
public class Q_21 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i=1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}

}
