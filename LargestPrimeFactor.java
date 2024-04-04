

package toolsAssignment;

import java.util.Scanner;

public class LargestPrimeFactor {

    public static long largestPrimeFactor(long n) {
        long maxPrime = -1;
        
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        
        if (n > 2) {
            maxPrime = n;
        }
        
        return maxPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        scanner.close();
        
        long result = largestPrimeFactor(num);
        System.out.println("Largest prime factor of " + num + " is: " + result);
    }
}
