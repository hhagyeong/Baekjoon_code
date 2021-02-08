package ch04_while;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/10952
 * 문제: A+B - 5
 */
public class no10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0) {
				scanner.close();
				break;
			}
			System.out.println(a + b);
		}
	}

}
