package inflern.algorithm.cote.sec2;

import java.util.Scanner;

public class Prac202 {

/*	설명

	N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

	(첫 번째 수는 무조건 출력한다)


	입력
	첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


	출력
	자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
	*/
	
	public String solution(int[] intArr) {
		int tmp = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < intArr.length ; i++) {
			if(intArr[i] > tmp) {
				sb.append(intArr[i]);
			}
			tmp = intArr[i];
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Prac202 T = new Prac202();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int i = 0;
		int[] numArr = new int[num];
		while(i < num) {
			numArr[i] = sc.nextInt();
			i++;
		}
		
		System.out.println(T.solution(numArr));
		
		sc.close();
	}

}
