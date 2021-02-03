package ch03_for;

import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2741
 * 문제: N 찍기
 */
public class no2741 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=100000; i++) {
			if(i<=n) {
				System.out.println(i);
			}
		}

	}

}
