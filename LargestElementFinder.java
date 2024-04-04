package toolsAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestElement {

	public int findLargestElement(int[] arr) {
	    int max = arr[0];
	    for (int i=0;i<arr.length;i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
		return max;
	}
	
	public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=input.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter array values");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(" arr["+i+"]= ");
        	arr[i]=input.nextInt();
        }

        LargestElement element= new LargestElement();
        int result = element.findLargestElement(arr);
        System.out.println("The Largest number is: " + result);
    }
}
