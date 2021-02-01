package ch02_if;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2753
 * 문제: 윤년
 */
public class no2753 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		// 조건1: 4의 배수
		if (year % 4 == 0) {
			//조건1-1: 400의 배수||조건 1-2: 100의 배수
			if (year % 400 == 0 || year % 100 == 0) {
				System.out.println("1");
			}
		} else
			System.out.println("0");
	}
}
