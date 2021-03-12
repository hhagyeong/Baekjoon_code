package ch05_singleDimensionalArray;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/4344
 * 문제: 평균은 넘겠지
 */
public class no4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr;

		int C = scanner.nextInt(); // 케이스 수

		for (int i = 0; i < C; i++) {

			int N = scanner.nextInt(); // 학생 수
			arr = new int[N];

			double sum = 0; // 성적 총합 변수

			// 성적 입력
			for (int j = 0; j < N; j++) {
				int scores = scanner.nextInt(); // 성적 입력
				arr[j] = scores;
				sum += scores; // 성적 총합
			}

			double avg = (sum / N);
			double count = 0; // 평균 넘는 학생 수 변수

			// 평균 넘는 학생 비율
			for (int j = 0; j < N; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}

			System.out.printf("%.3f%%\n", (count / N) * 100);

		}
		scanner.close();
	}

}
