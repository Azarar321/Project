
package org.level1;

public class A_Sample {
	public static void main(String[] args) {

		try {
			String s=null;
			System.out.println(s.length());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
