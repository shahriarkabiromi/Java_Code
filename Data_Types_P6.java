
//Program to enter length in centimeters and convert it into meters and kilometers
import java.util.Scanner;
public class Data_Types_P6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter length in centimeters: ");
            double lengthInCm = scanner.nextDouble();

            double lengthInMeter = lengthInCm / 100;
            double lengthInKilometer = lengthInCm / 100000;

            System.out.println("Length in meters: " + lengthInMeter);
            System.out.println("Length in kilometers: " + lengthInKilometer);
        }
    }
