package ch05_singleDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2562
 * 문제: 최댓값
 */
public class no2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int arr[] = new int[9]; // 9개의 서로 다른 자연수
		int count = 0; // 카운트
		int max = 0; // 최댓값

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			// arr[i]가 max보다 크면
			if (arr[i] > max) {
				max = arr[i];
				count = i + 1; // 0부터니까 +1
			}
		}
		System.out.println(max + "\n" + count);
	}
}
