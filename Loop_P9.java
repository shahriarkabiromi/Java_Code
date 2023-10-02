

//Program to enter any number and calculate the sum of all natural numbers between 1 to n
import java.util.Scanner;
public class Loop_P9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer (n): ");
            int n = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
        }
    }
