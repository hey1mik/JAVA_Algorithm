package inflern.algorithm.cote.sec1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prac6 {

	/*
	 * �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 * 
	 * �ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
	 * 
	 * 
	 * �Է� ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
	 * 
	 * 
	 * ��� ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
	 */
	public String solution(String str) {
		Map<String, Boolean> map = new HashMap<String, Boolean>(); 
		String tmp;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			tmp = String.valueOf(str.charAt(i));
			
			if(map.containsKey(tmp)) {
				continue;
			} else {
				map.put(tmp, true);
				sb.append(tmp);
			}			
		}
		
		String result = sb.toString();
		return result;
	}

	public static void main(String[] args) {
		
		Prac6 T = new Prac6();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = T.solution(str);
		System.out.println(answer);
	}

}
