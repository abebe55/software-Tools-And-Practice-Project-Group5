package toolsAssignment;

import java.util.Scanner;

public class LargestPrimeFactor {

    public long calculateLargestPrimeFactor(long number) {
        long largestPrimeFactor = 1;
        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number /= 2;
        }

        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrimeFactor = number;
        }

        return largestPrimeFactor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its largest prime factor: ");
        long inputNumber = scanner.nextLong();

        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        long result = largestPrimeFactor.calculateLargestPrimeFactor(inputNumber);
        System.out.println("Largest prime factor of " + inputNumber + " is: " + result);
    }
}

