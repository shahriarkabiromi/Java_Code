
//Program to check whether a number is negative, positive, or zero
import java.util.Scanner;
public class Conditional_Logic_P5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }

