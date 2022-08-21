package inflern.algorithm.cote.sec1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac4 {
	/*
	 * ����
	 * 
	 * N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * 
	 * 
	 * �Է� ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
	 * 
	 * �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	 * 
	 * 
	 * ���
	 * N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
	 */
	
	public ArrayList<String> solution(int wordCnt, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}


	public static void main(String[] args) {
		
		Prac4 T = new Prac4();
		
		Scanner sc = new Scanner(System.in);
		int wordCnt = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[wordCnt];
		for(int i=0; i<wordCnt; i++) {
			str[i] = sc.next();
		}
		
		for(String x : T.solution(wordCnt, str)) {
			System.out.println(x);
		}

	}

}
