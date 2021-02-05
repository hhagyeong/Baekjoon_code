package ch03_for;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/11022
 * 문제: A+B-8
 */
public class no11022 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}

	}

}
