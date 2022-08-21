package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac3 {
	
	/*
	 * ����
	 * 
	 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * 
	 * ������� �� �ܾ�� �������� ���е˴ϴ�.
	 * 
	 * 
	 * �Է� ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	 * 
	 * 
	 * ��� ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �մϴ�.
	 */
	
	public String solution(String sentence) {
		
		String[] words = sentence.split(" ");
		int lngth = 0;
		int max = 0;
		String maxWord = null;
		
		for(String word : words) {
			lngth = word.length();
			if(lngth > max) {
				max = lngth;
				maxWord = word;
			}
		}
		
		return maxWord;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		Prac3 T = new Prac3();
		
		System.out.println("���� �� �ܾ� : " + 	T.solution(sentence));

	}
	


}
