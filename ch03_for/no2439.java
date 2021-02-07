package ch03_for;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2439
 * 문제: 별찍기-2
 */
public class no2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n - i; ++j) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
