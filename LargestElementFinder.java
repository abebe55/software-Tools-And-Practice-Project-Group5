package toolsAssignment;
import java.util.Scanner;

public class LargestElementFinder {

    public int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        LargestElementFinder finder = new LargestElementFinder();
        int largestElement = finder.findLargestElement(arr);
        System.out.println("The largest element in the array is: " + largestElement);
    }
}




