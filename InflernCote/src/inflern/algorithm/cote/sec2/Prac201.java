package inflern.algorithm.cote.sec2;

import java.util.Scanner;

public class Prac201 {

	public String solution(int num, int[] inArr) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < inArr.length; i++) {
			if(i == 0) {
				sb.append(String.valueOf(inArr[i]));
			} else if(i > 0) {
				if(inArr[i] > inArr[i-1]) {
					sb.append(String.valueOf(inArr[i]));
				}
			} 
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Prac201 T = new Prac201();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] inArr = new int[num];
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			inArr[i] = sc.nextInt();
		}
		System.out.println(T.solution(num, inArr));
		sc.close();
		
	}
}
