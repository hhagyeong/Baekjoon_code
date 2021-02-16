package ch05_singleDimensionalArray;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2577
 * 문제: 숫자의 개수
 */
public class no2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int result = a * b * c;

		int[] arr = new int[10];

		while (result > 0) {
			arr[result % 10]++; 
			result /= 10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
