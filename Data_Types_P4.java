
//Program to enter the length and breadth of a rectangle and find its area
import java.util.Scanner;
public class Data_Types_P4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            double area = length * breadth;

            System.out.println("The area of the rectangle is: " + area);
        }
    }
