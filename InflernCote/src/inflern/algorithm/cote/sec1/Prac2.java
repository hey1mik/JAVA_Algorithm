package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac2 {
	
	// �Է�
	// ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
	// ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ִ�.
	
	// ���
	// ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����Ѵ�.
	
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
