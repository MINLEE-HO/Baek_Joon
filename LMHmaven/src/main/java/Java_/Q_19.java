package Java_;

import java.util.Scanner;

/* Problem Number : 2525
 * Problem Name   : 오븐시계
 */
public class Q_19 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		if ( m + t >= 120) {
			H++;
			H++;
			if (H >= 24) {
				H = H-24;
			} else {
				H= H*-1;
			}
			System.out.println(-H + " " + ((m+t)-120));
		} else if ( m + t >= 60){
			H++;
			if ( H >= 24) {
				H = H-24;
			} else {
				H = H*-1;
			}
			System.out.println(-H + " " + ((m+t)-60));
		} else {
			System.out.println(H + " " + (m+t));
		}
	}
}
