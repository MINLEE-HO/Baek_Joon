package Java_;

import java.util.Scanner;

/* Problem Number : 2562
 * Problem Name   : 최댓값
 */
public class Q_35 {
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = arr[0];
		int index = 0;
		
		for (int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			if ( arr[i] > max) {
				max = arr[i];
			}
			
			if (max == arr[i]) {
				index = max;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
