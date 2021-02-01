package ch02_if;

import java.util.Scanner;

/* 
 *주소: https://www.acmicpc.net/problem/2884
 *문제: 알람 시계(45분 빠른)
 */
public class no2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();

		//조건1: 45분 이상
		if (M >= 45) {
			M = M - 45;
			//조건2: 45분 미만
		} else if (M < 45) {
			H = H - 1;
			M = M + 15;
			//조건2-1: 0시
			if (H <= 0) {
				H = 23;
			}
		}
		System.out.println(H + " " + M);
	}

}
