package org.level1;

public class HCF {
	
	public static void main(String[] args) {
		int num1=12,num2=30,hcf=0;
		for (int i=1;i<=num1;i++) {
			if((num1%i==0)&&(num2%i==0))
				hcf=i;
		}
		System.out.println(hcf);
	}	

}
