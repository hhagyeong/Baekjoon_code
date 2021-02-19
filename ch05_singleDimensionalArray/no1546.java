package ch05_singleDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/1546
 * 문제: 평균
 */
public class no1546 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double arr[] = new double[scanner.nextInt()]; // 소수점까지 하기위해 double로

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
		}
		scanner.close();

		double sum = 0; // 총합
		Arrays.sort(arr); // 오름차순 정렬

		for (int i = 0; i < arr.length; i++) {
			double m = arr[arr.length - 1]; // 최댓값
			sum += ((arr[i] / m) * 100);
		}
		double avg = sum / arr.length; // 평균
		System.out.println(avg);
	}

}
