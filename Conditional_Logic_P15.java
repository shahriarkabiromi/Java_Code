

//Program to input all sides of a triangle and check whether the triangle is valid or not
import java.util.Scanner;
public class Conditional_Logic_P15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of side 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter the length of side 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter the length of side 3: ");
            double side3 = scanner.nextDouble();

            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                System.out.println("The triangle is valid.");
            } else {
                System.out.println("The triangle is not valid.");
            }
        }
    }
