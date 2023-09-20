

//Program to find the maximum between three numbers
import java.util.Scanner;
public class Conditional_Logic_P2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = scanner.nextDouble();

            double max = Math.max(num1, Math.max(num2, num3));

            System.out.println("The maximum number between " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
        }
    }
