package org.level1;

public class CountOddEven {
	
	public static void main(String[] args) {
		int n=101,evencount=0,oddcount=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Even numbers==>"+evencount);
		System.out.println("Odd numbers==>"+oddcount);	
	}
}
