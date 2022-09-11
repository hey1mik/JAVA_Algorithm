package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac7 {
	
	/*
	 * ����
	 * 
	 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
	 * 
	 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * 
	 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
	 * 
	 * 
	 * �Է� ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
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
		
		System.out.println("is it ȸ�� ����? : " + T.solution(word));

	}

}
