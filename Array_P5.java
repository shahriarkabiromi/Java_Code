
//Program to sort array elements
import java.util.Scanner;
import java.util.Arrays;
public class Array_P5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);

            System.out.println("Sorted array:");

            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }