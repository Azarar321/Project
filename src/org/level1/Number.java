package org.level1;

public class Number {
	
	public static void main(String[] args) {
		
		String s1="Azarara321@gmail.com";
		int s=0,c=0,n=0,ch=0;
		String small="",caps="",digit="",spcl="";
		for(int i=0;i<s1.length();i++) {
			char a = s1.charAt(i);
			if(a>='a'&&a<='z') {
				s++;
				small=small+a;
			}
			else if(a>='A'&&a<='Z') {
				c++;
				caps=caps+a;
			}
			else if(a>='0'&&a<='9') {
				n++;
				digit=digit+a;
			}
			else {
				ch++;
				spcl=spcl+a;
			}
		}
		System.out.println("Small==>"+s+"==>"+small);
		System.out.println("Capital==>"+c+"==>"+caps);
		System.out.println("Digit==>"+n+"==>"+digit);
		System.out.println("Special Character==>"+ch+"==>"+s);
	}
}
