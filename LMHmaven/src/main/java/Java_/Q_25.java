package Java_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* Problem Number : 15552
 * Problem Name   : 빠른 A+B
 */
public class Q_25 {
	public static void main(String argv[]) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for (int i =0; i<n; i++) {
			String s = bf.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			bw.write(a+b+"\n");
		}
		bw.flush();
		
	}
}
