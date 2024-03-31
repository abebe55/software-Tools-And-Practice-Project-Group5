package toolsAssignment;

import java.util.Scanner;

public class EuclideanAlgorithm {

    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        int gcd = euclideanAlgorithm.findGCD(num1, num2);
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
    }
}

