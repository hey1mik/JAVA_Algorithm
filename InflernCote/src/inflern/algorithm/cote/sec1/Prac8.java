package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac8 {

	/*
	 * ����
	 * 
	 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
	 * 
	 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * 
	 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
	 * 
	 * ���ĺ� �̿��� ���ڵ��� �����մϴ�.
	 * 
	 * 
	 * �Է� ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
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
