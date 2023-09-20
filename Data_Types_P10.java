

//Program to find the power of any number x^y
import java.util.Scanner;
public class Data_Types_P10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the base (x): ");
            double x = scanner.nextDouble();

            System.out.print("Enter the exponent (y): ");
            double y = scanner.nextDouble();

            double result = Math.pow(x, y);

            System.out.println(x + "^" + y + " = " + result);
        }
    }
