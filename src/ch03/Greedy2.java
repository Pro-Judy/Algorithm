package ch03;

import java.util.Arrays;
import java.util.Scanner;

// ū ���� ��Ģ
public class Greedy2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // �迭�� ũ��
		int M = sc.nextInt(); // ���ڰ� �� ������ Ƚ��
		int K = sc.nextInt(); // K�� ���� ������

		int sum = 0;

		int[] number = new int[N]; // 2 4 5 4 6
		
		for(int i=0; i<N; i++) {
			number[i] = sc.nextInt();
		}

		Arrays.sort(number);
		
		while (true) {		
			for(int i=0; i<K; i++) {
				if (M == 0) {
					break;
				}
				sum += number[N-1];
				M--;
			}
			sum += number[N-2];
			M--;
			
			if (M == 0) {
				break;
			}
		}
		System.out.println(sum);
	}
}
