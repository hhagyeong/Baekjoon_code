package ch02_if;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/1330
 * 문제: 두 수 비교하기
 */
public class no1330 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		scanner.close();

		// 삼항연산자 이용
		System.out.println((A > B) ? ">" : ((A < B) ? "<" : "=="));

	}

}
