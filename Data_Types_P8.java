
//Program to enter temperature in Fahrenheit and convert it into Celsius
import java.util.Scanner;
public class Data_Types_P8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5/9;

            System.out.println("Temperature in Celsius: " + celsius);
        }
    }
