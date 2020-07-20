/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author SinghAvi_13
 *
 */
public class myClassTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		int n = 0;
		System.out.println("Hello SOftware engneering World");
		System.out.println("Input Your number and press enter");
		n = myScan.nextInt();
		System.out.println("Reverse of the input number");
		reverseMethod(n);
		System.out.println();

	}
	
	public static void reverseMethod(int num) {
		if (num < 10) {
			System.out.print(num);
		}else {
			System.out.print(num % 10);
			reverseMethod(num/10);
		}
	}
	
}
