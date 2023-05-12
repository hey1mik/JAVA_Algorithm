package inflern.algorithm.cote.sec1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Prac01 {
	
	/*
	 * 설명
	 * 
	 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	 * 
	 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
	 * 
	 * 
	 * 입력 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
	 * 
	 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
	 * 
	 * 
	 * 출력
	 */
	
	public int solution(String str1, String str2) {
		
		int result = 0;
		String cmpStr = str2.toLowerCase();
		char[] chrArr = str1.toCharArray();
		for(int i = 0; i < chrArr.length; i++) {
			if(String.valueOf(chrArr[i]).toLowerCase().equals(cmpStr)) {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Prac01 T = new Prac01();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();	
		System.out.println(T.solution(str1, str2));
		sc.close();

	}
}
