package inflern.algorithm.cote.sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac206 {
	
/*	설명

	자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

	만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


	입력
	첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


	출력
	첫 줄에 소수의 개수를 출력합니다.*/
	
	public int solution(int num) {
		List<Integer> divider = new ArrayList<Integer>();
		divider.add(2);
		boolean isDividable = false;
			
			if(num == 2) {
				return 1;
			} else {
				for(int i = 3; i <= num; i++) {
					for(int j = 0; j < divider.size(); j++) {
						if((i % divider.get(j)) == 0) {
							isDividable = true;
							break;
						} else {
							isDividable = false;
						}
					}
					
					if(!isDividable) {
						divider.add(i);
					}
				}
			}		
		
		return divider.size();
	}
	
	public static void main(String[] args) {
		Prac206 T = new Prac206();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(T.solution(num));
		sc.close();
	}
}
