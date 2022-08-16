package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac2 {
	
	// 입력
	// 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다.
	// 문자열은 영어 알파벳으로만 구성되어 있다.
	
	// 출력
	// 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력한다.
	
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			} else if(Character.isUpperCase(x)) {
				answer += Character.toLowerCase(x);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Prac2 T = new Prac2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
	}
	
}
