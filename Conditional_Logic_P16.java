
//Program to check whether the triangle is equilateral, isosceles, or scalene
import java.util.Scanner;
public class Conditional_Logic_P16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of side 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter the length of side 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter the length of side 3: ");
            double side3 = scanner.nextDouble();

            if (side1 == side2 && side2 == side3) {
                System.out.println("It is an equilateral triangle.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("It is an isosceles triangle.");
            } else {
                System.out.println("It is a scalene triangle.");
            }
}
}