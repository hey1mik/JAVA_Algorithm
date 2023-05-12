package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac10 {

/*	설명

	한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


	입력
	첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

	문자열의 길이는 100을 넘지 않는다.


	출력
	첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.*/
	
	
	public int[] solution(String str) {
		String[] strArr = str.split(" ");
		int[] distance = new int[strArr[0].length()];
		int[] distance1 = new int[strArr[0].length()];
		int[] distance2 = new int[strArr[0].length()];
		int tmp1 = 0;
		int tmp2 = 0;
		
		if(strArr.length > 1) {
			String sntnc = strArr[0];
			String cmpChar = strArr[1];
			
			for(int i = 0; i < sntnc.length(); i++) {
				if(!String.valueOf(sntnc.charAt(i)).equals(cmpChar)) {
					tmp1++;
				} else {
					tmp1 = 0;
				}
				distance1[i] = tmp1;
				
				
				if(!String.valueOf(sntnc.charAt(sntnc.length()-1-i)).equals(cmpChar)) {
					tmp2++;
				} else {
					tmp2 = 0;
				}
				distance2[sntnc.length()-1-i] = tmp2;
			}
			
			for(int j = 0; j < sntnc.length(); j++) {
				if(distance1[j] > distance2[j]) {
					distance[j] = distance2[j];
				} else {
					distance[j] = distance1[j];
				}
			}
			
		}
		
		return distance;
	}
	
	public static void main(String[] args) {
		
		Prac10 T = new Prac10();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] result = T.solution(str);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
		sc.close();
	}
	
}
