package ch05_singleDimensionalArray;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/8958
 * 문제: OX퀴즈
 */
public class no8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String[] arr = new String[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}
		scanner.close();

		for (int i = 0; i < arr.length; i++) {

			int count = 0; // 연속카운트
			int score = 0; // 점수

			for (int j = 0; j < arr[i].length(); j++) {
				//'O'이면 count++
				if (arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				score += count;
			}
			System.out.println(score);
		}

	}

}
