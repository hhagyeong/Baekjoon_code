package ch03_for;
/* 
 * 주소: https://www.acmicpc.net/problem/8393
 * 문제: 합
 */

import java.util.Scanner;

public class no8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;

		//조건: n (1 ≤ n ≤ 10,000)
		for (int i = 1; i <= 10000; i++) {
			//i가 n보다 작거나 같으면 합하기
			if (i <= n) {
				sum = sum + i;
			}
		}System.out.println(sum);

	}

}
