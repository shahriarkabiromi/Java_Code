

//Program to print the sum of all odd numbers between 1 to n
import java.util.Scanner;
public class Loop_P7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer (n): ");
            int n = scanner.nextInt();

            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum += i;
                i += 2;
            }

            System.out.println("Sum of odd numbers between 1 to " + n + " is: " + sum);
        }
    }
