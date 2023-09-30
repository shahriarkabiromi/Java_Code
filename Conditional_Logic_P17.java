

//Program to find all roots of a quadratic equation
import java.util.Scanner;
public class Conditional_Logic_P17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the coefficients (a, b, c) of the quadratic equation: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The equation has a single root: " + root);
            } else {
                System.out.println("The equation has complex roots.");
            }
        }
    }
