package ch03_for;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/10871
 * 문제: X보다 작은 수
 */
public class no10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < n; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");

			}
		}
	}

}
