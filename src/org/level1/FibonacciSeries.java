package org.level1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=0,feb=1;
		for(int i=1;i<10;i++) {
			System.out.println(feb);
			a=b;
			b=feb;
			feb=a+b;
		}
	}
}
