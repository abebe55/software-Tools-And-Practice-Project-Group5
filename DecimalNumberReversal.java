package toolsAssignment;

import java.util.Scanner;

public class DecimalNumberReversal {

    public String reverseDecimalNumber(double number) {
        String numStr = Double.toString(number);
        String[] parts = numStr.split("\\.");
        String integerPart = new StringBuilder(parts[0]).reverse().toString();
        String decimalPart = new StringBuilder(parts[1]).reverse().toString();
        return decimalPart + "." + integerPart;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double inputNumber = scanner.nextDouble();

        DecimalNumberReversal decimalNumberReversal = new DecimalNumberReversal();
        String reversedNumber = decimalNumberReversal.reverseDecimalNumber(inputNumber);
        System.out.println("Reversed decimal number: " + reversedNumber);
    }
}

