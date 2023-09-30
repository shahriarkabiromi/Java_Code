
//Program to print all natural numbers from 1 to n
import java.util.Scanner;
public class Loop_P1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer (n): ");
            int n = scanner.nextInt();

            int i = 1;

            while (i <= n) {
                System.out.print(i + " ");
                i++;
            }
        }
    }

