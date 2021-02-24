package org.level1;

public class PerfectNum {
	public static void main(String[] args) {
		int num=1000;
		for(int i=1;i<=num;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}

}
