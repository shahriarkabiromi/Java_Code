

//Program to find the second largest element in an array
import java.util.Scanner;
public class Array_P1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : array) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondLargest != Integer.MIN_VALUE) {
                System.out.println("The second largest element is: " + secondLargest);
            } else {
                System.out.println("There is no second largest element in the array.");
            }
        }
    }