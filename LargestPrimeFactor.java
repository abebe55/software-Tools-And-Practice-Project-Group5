

package toolsAssignment;

import java.util.Scanner;


public class LargestPrimeFactor{
    
public int largestPrimeFactor(int num) {
    int factor = 2;
    while (num > 1) {
        if (num % factor == 0) {
            num /= factor;
        } else {
            factor++;
        }
    }
    
	return factor;
}

  


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number to find its largest prime factor: ");
        int inputNumber = input.nextInt();

        LargestPrimeFactor factor= new LargestPrimeFactor();
        int result = factor.largestPrimeFactor(inputNumber);
        System.out.println("Largest prime factor of " + inputNumber + " is: " + result);
    }
}

