package ch05_singleDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/10818
 * 문제: 최소, 최대
 */
public class no10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < n; i++) {
			number[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.sort(number); // 오름차순 정렬
		System.out.println(number[0] + " " + number[n - 1]);

	}

}
