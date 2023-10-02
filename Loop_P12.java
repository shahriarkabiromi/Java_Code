


//Program to find the frequency of each digit in a given integer
import java.util.Scanner;
public class Loop_P12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            long num = scanner.nextLong();

            int[] frequency = new int[10];

            while (num != 0) {
                int digit = (int) (num % 10);
                frequency[digit]++;
                num /= 10;
            }

            System.out.println("Digit frequencies:");

            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + ": " + frequency[i] + " times");
                }
            }
        }
    }
