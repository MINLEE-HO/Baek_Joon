package Java_;

import java.util.Arrays;
import java.util.Scanner;

/* Problem Number : 10818
 * Problem Name   : 최소,최대
 */
public class Q_34 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] +" "+ arr[n-1]);
	}
}
