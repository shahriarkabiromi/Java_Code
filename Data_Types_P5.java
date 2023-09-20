
//Program to enter the radius of a circle and find its diameter, circumference, and area
import java.util.Scanner;
public class Data_Types_P5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double diameter = 2 * radius;
            double circumference = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Diameter: " + diameter);
            System.out.println("Circumference: " + circumference);
            System.out.println("Area: " + area);
        }
    }
