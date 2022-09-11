package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac7 {
	
	/*
	 * 설명
	 * 
	 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	 * 
	 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	 * 
	 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
	 * 
	 * 
	 * 입력 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
	 */
	
	public boolean solution(String word) {
		
		String evenWord = word.toLowerCase();
		char[] chrArry = evenWord.toCharArray();
		
		int leftIndex = 0;
		int rightIndex = word.length()-1;
		
		for(leftIndex = 0; leftIndex < rightIndex; leftIndex++) {
			if(chrArry[leftIndex] == chrArry[rightIndex]) {
				rightIndex--;
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		Prac7 T = new Prac7();
		
		String word = sc.nextLine();
		
		System.out.println("is it 회문 문자? : " + T.solution(word));

	}

}
