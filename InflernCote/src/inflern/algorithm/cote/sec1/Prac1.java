package inflern.algorithm.cote.sec1;

import java.util.Scanner;

public class Prac1 {
	
	/*
	 * ����
	 * 
	 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
	 * 
	 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
	 * 
	 * 
	 * �Է� ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
	 * 
	 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
	 * 
	 * 
	 * ���
	 */
	
	public int solution(String str1, String str2) {
		
		String[] str1Array = str1.split(" ");
		int count = 0;		
		for(String spltdStr : str1Array) {
			if(spltdStr.contentEquals(str2)) {
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Prac1 T = new Prac1();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(T.solution(str1, str2));

	}
}
