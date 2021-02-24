package org.level1;

public class PrimeNumber {

	public static void main(String[] args) {
		int  n=13, check=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				check++;
				break;
			}
		}
		if(check==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime Number");
		}

	}

}
