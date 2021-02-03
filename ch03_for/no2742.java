
package ch03_for;
import java.util.Scanner;

/* 
 * 주소: https://www.acmicpc.net/problem/2742
 * 문제: 기찍 N
 */

public class no2742 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=100000; i>=1; i--) {
			if(i<=n) {
				System.out.println(i);
			}
		}

	}

}
