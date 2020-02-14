package assignment;

import java.util.HashSet;

public class PrintQ3 {
	public String manipulateString(String str) {
		int len=str.length();
		HashSet<Character> hs=new HashSet<Character>();
		
		String out="";
		for(int i=len-1;i>=0;i--) {
			char c=str.charAt(i);
			if(!hs.contains(c)) {
				out+=c;
				hs.add(c);
			}
		}
		return out;
	}
	public static void main(String[] args) {
		PrintQ3 p=new PrintQ3();
		String inputStr="aabcdaafhbdr";
		String outputStr=p.manipulateString(inputStr);
		System.out.println(outputStr);
	}

}
