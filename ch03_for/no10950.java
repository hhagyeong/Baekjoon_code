package ch03_for;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/10950
 * 문제: A+B-3
 */
public class no10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 테스트의 개수 T
		int T = scanner.nextInt();

		// for문으로 T의 수만큼 테스트 반복
		for (int i = 1; i <= T; i++) {
			// A,B 입력
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A + B);
		}

	}

}
