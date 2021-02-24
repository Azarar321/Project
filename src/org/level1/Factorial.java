package org.level1;

public class Factorial {

	public static void main(String[] args) {

		int n=5,Fact=1;
		while(n>0) {
			Fact=Fact*n;
			n--;
		}
		System.out.println(Fact);
	}

}
