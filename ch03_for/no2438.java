package ch03_for;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2438
 * 문제: 별찍기 -1
 */
public class no2438 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
