package ch03_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* 
 * 주소: https://www.acmicpc.net/problem/15552
 * 문제: 빠른 A+B
 */
public class no15552 {

	public static void main(String[] args) throws IOException {
		// 빠른 실행을 위해 Scanner가 아닌 BufferReader과 BufferWriter이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();

		bw.flush();
		bw.close();
	}

}
