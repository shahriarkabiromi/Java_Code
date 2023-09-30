
//Program to input angles of a triangle and check whether the triangle is valid or not
import java.util.Scanner;
public class Conditional_Logic_P14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first angle: ");
            double angle1 = scanner.nextDouble();

            System.out.print("Enter the second angle: ");
            double angle2 = scanner.nextDouble();

            System.out.print("Enter the third angle: ");
            double angle3 = scanner.nextDouble();

            if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
                System.out.println("The triangle is valid.");
            } else {
                System.out.println("The triangle is not valid.");
            }
        }
    }
