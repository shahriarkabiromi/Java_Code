

//Program to print all natural numbers in reverse (from n to 1)
import java.util.Scanner;
public class Loop_P2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer (n): ");
            int n = scanner.nextInt();

            int i = n;

            while (i >= 1) {
                System.out.print(i + " ");
                i--;
            }
        }
    }
