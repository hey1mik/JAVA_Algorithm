package inflern.algorithm.cote.sec2;

import java.util.Scanner;

public class Prac204 {

	public String solution(int num, String rsp1, String rsp2) {
		String[] rspArr1 = rsp1.split(" ");
		String[] rspArr2 = rsp2.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			int aRsp = Integer.parseInt(rspArr1[i]);
			int bRsp = Integer.parseInt(rspArr2[i]);
			
			if(aRsp == 1) {
				if(bRsp == 1) {
					sb.append("D\n");
				} else if (bRsp == 2) {
					sb.append("B\n");
				} else if (bRsp == 3) {
					sb.append("A\n");
				}
			} else if (aRsp == 2) {
				if(bRsp == 1) {
					sb.append("A\n");
				} else if (bRsp == 2) {
					sb.append("D\n");
				} else if (bRsp == 3) {
					sb.append("B\n");
				}
				
			} else if (aRsp == 3) {
				if(bRsp == 1) {
					sb.append("B\n");
				} else if (bRsp == 2) {
					sb.append("A\n");
				} else if (bRsp == 3) {
					sb.append("D\n");
				}
			}
			
			if(i == num-1) {
				sb.substring(num*2 -1);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Prac204 T = new Prac204();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String rsp1 = sc.nextLine();
		String rsp2 = sc.nextLine();
		
		System.out.println(T.solution(num, rsp1, rsp2));
		
		sc.close();
	}
}
