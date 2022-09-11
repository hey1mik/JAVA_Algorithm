package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac8 {

	/*
	 * 설명
	 * 
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
	 * 
	 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	 * 
	 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
	 * 
	 * 알파벳 이외의 문자들의 무시합니다.
	 * 
	 * 
	 * 입력 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
	 */
	
	public String solution(String str) {
		
		String evenStr = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < evenStr.length(); i++) {
			if(Character.isLetter(evenStr.charAt(i))) {
				sb.append(evenStr.charAt(i));
			}
		}
		
		String letter = sb.toString();
		System.out.println(letter);
		
		int lIndex = 0;
		int rIndex = letter.length()-1;
		
		for(lIndex = 0; lIndex < rIndex; lIndex++) {
			if(letter.charAt(lIndex) == letter.charAt(rIndex)) {
				rIndex--;
				continue;
			} else {
				return "NO";
			}
		}

		return "YES";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Prac8 T = new Prac8();
		String result = T.solution(str);
		
		System.out.println(result);
	}

}
