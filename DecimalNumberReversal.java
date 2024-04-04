package toolsAssignment;


import java.util.Scanner;

public class DecimalNumberReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();
        System.out.println("Reversed number: " + reverseDecimalNumber(number));
        scanner.close();
    }

    public static double reverseDecimalNumber(double number) {
        String numberStr = String.valueOf(number);
        int dotpos=numberStr.indexOf(".");
        StringBuilder reversedStr = new StringBuilder(numberStr.replace(".","" ));


        StringBuilder decimalPart = reversedStr.reverse();

        StringBuilder  decimalPart2=new StringBuilder();
        int d=0;
      for(int i=0;i<=decimalPart.length();i++) {
    	  if(i==dotpos) {

    		  decimalPart2.append(".");
    		  d=1;

    	  }
    	  else if(d==1) {


    		  decimalPart2.append(decimalPart.charAt(i-1));
    	  }
    	  else

    		  decimalPart2.append(decimalPart.charAt(i));
      }



        return Double.parseDouble(decimalPart2.toString());
    }
}
