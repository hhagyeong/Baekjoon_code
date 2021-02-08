package ch04_while;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/10951
 * 문제: A+B - 4
 */
public class no10951 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a + b);
		}
		scanner.close();

	}

}
