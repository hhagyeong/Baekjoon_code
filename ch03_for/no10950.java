package ch03_for;

import java.util.Scanner;

/* 
 * �ּ�: https://www.acmicpc.net/problem/10950
 * ����: A+B-3
 */
public class no10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �׽�Ʈ�� ���� T
		int T = scanner.nextInt();

		// for������ T�� ����ŭ �׽�Ʈ �ݺ�
		for (int i = 1; i <= T; i++) {
			// A,B �Է�
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println(A + B);
		}

	}

}
