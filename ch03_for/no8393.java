package ch03_for;
/* 
 * �ּ�: https://www.acmicpc.net/problem/8393
 * ����: ��
 */

import java.util.Scanner;

public class no8393 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;

		//����: n (1 �� n �� 10,000)
		for (int i = 1; i <= 10000; i++) {
			//i�� n���� �۰ų� ������ ���ϱ�
			if (i <= n) {
				sum = sum + i;
			}
		}System.out.println(sum);

	}

}
