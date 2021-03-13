package ch06_function;

/* 
 * 주소: https://www.acmicpc.net/problem/15596
 * 문제: 정수 N개의 합
 */
public class no15596 {

	long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
