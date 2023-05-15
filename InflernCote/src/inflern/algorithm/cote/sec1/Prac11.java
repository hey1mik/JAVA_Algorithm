package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac11 {
	
/*	설명

	알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

	문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

	단 반복횟수가 1인 경우 생략합니다.


	입력
	첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


	출력
	첫 줄에 압축된 문자열을 출력한다.
	*/
	
	public String solution(String str) {
		char[] chrArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		String key = "";
		int num = 1;
			
		for(int i=0; i < chrArr.length; i++) {
			String chrStr = String.valueOf(chrArr[i]);
			if(chrStr.equals(key)) {
				num++;
				if(i==chrArr.length-1) {
					sb.append(String.valueOf(num));
				}
			} else {
				if(num > 1) {
					sb.append(String.valueOf(num));
				}
				sb.append(chrStr);
				
				num = 1;
				key = chrStr;
			}		
		}	
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		Prac11 T = new Prac11();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		sc.close();
	}
}
