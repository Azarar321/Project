package org.level1;

public class CountOfNum {

	public static void main(String[] args) {
		int num=156787,count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println("count of numbers==> "+count);

	}
}
