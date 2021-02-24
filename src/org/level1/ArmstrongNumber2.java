package org.level1;

public class ArmstrongNumber2 {
	public static void main(String[] args) {
		int num=153,n;
		int a=num;
		int b=0;
        while(num>0) {
        	n=num%10;
        	b=b+(n*n*n);
        	num=num/10;
        }
		if(b==a) {
			System.out.println("armstrong Number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}
}
