package ch05_singleDimensionalArray;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/3052
 * 문제: 나머지
 */
public class no3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10]; // 배열 길이 10
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt() % 42; // 10개의 수를 입력받고 42로 나눔
		}
		// 중복값 검사
		for (int i = 0; i < arr.length; i++) {// 10의 값 중 확인
			int cnt = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) { // 같으면 +1
					cnt++;
				}
			}
			if (cnt == 0) { // cnt가 0일 경우(중복값이 없을 경우)에만 +1
				count++;
			}

		}
		System.out.println(count);
	}

}
