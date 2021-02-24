package org.level1;

public class Palindrome {
	
	public static void main(String[] args) {
		int num=1576751,rev=0,m=0;
		int temp=num;
		while(num>0) {
			m=num%10;
			rev=(rev*10)+m;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
