package ch04_while;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/1110
 * 문제: 더하기 사이클
 */
public class no1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int copy = n;
		int count = 0;

		while (true) {
			n = ((n % 10) * 10) + ((n / 10) + (n % 10)) % 10;
			count++;

			// 처음 입력값과 같으면 break
			if (copy == n) {
				break;
			}
		}
		System.out.println(count);
	}
}
