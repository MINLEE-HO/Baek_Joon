package Java_;

import java.util.Scanner;

/* Problem Number : 10807
 * Problem Name   : 개수 세기
 */
public class Q_32 {	
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		for (int j=0; j<arr.length; j++) {
			if (b==arr[j]) {
				cnt +=1;
			}
		}
		System.out.println(cnt);
		
	}

}
