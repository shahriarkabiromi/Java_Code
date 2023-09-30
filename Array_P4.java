
//Program to copy all elements from one array to another array
import java.util.Scanner;
public class Array_P4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] sourceArray = new int[size];
            int[] destinationArray = new int[size];

            System.out.println("Enter the elements of the source array:");

            for (int i = 0; i < size; i++) {
                sourceArray[i] = scanner.nextInt();
            }

            for (int i = 0; i < size; i++) {
                destinationArray[i] = sourceArray[i];
            }

            System.out.println("Elements copied to destination array:");

            for (int num : destinationArray) {
                System.out.print(num + " ");
            }
        }
    }
