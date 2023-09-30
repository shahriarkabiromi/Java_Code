
//Program to count the total number of even and odd elements in an array
import java.util.Scanner;
public class Array_P2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            int evenCount = 0;
            int oddCount = 0;

            for (int num : array) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Total even elements: " + evenCount);
            System.out.println("Total odd elements: " + oddCount);
        }
    }