package inflern.algorithm.cote.sec2;

import java.util.Scanner;

public class Prac205 {
/*	설명

	1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

	2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


	입력
	첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


	출력
	첫 줄에 피보나치 수열을 출력합니다.*/
	
	public String solution(int num) {
		int frstNum = 1;
		int scdNum = 1;
		int tmp = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(frstNum + " ");
		sb.append(scdNum + " ");
		for(int i = 2; i < num; i++) {
			tmp = frstNum + scdNum;
			sb.append(tmp + " ");
			frstNum = scdNum;
			scdNum = tmp;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Prac205 T = new Prac205();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(T.solution(num));
		sc.close();
	}
}
