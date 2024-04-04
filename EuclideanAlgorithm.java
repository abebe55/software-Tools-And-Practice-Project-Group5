package toolsAssignment;

import java.util.Scanner;

import toolsAssignment.LargestPrimeFactor;

public class EuclideanAlgorithm {

	public int euclideanAlgorithm(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
		return a;
	}
	
	 public static void main(String[] args) {
	        Scanner input= new Scanner(System.in);
	        System.out.print("Enter the first number : ");
	        int inputNumber1 = input.nextInt();
	        System.out.print("Enter the second number : ");
	        int inputNumber2 = input.nextInt();

	        EuclideanAlgorithm factor= new EuclideanAlgorithm();
	        int result = factor.euclideanAlgorithm(inputNumber1,inputNumber2);
	        System.out.println("the euclideanAlgorithm is:"+result);
	    }

}
