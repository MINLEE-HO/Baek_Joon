package Java_;

import java.util.Scanner;

/* Problem Number : 25304
 * Problem Name   : 영수증
 */
public class Q_23 {
	public static void main(String argv[]){
		Scanner sc = new Scanner(System.in);
		int to = sc.nextInt();
		int n = sc.nextInt();
		int val = 0;
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int t = sc.nextInt();
			val += a*t;
		}
		
		if (to == val) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
