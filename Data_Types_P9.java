

//Program to convert days into years, weeks, and days
import java.util.Scanner;
public class Data_Types_P9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of days: ");
            int days = scanner.nextInt();

            int years = days / 365;
            int remainingDays = days % 365;
            int weeks = remainingDays / 7;
            int remainingDaysInWeeks = remainingDays % 7;

            System.out.println("Years: " + years);
            System.out.println("Weeks: " + weeks);
            System.out.println("Days: " + remainingDaysInWeeks);
        }
    }