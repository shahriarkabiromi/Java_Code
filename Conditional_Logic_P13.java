
//Program to input month number and print the number of days in that month

import java.util.Scanner;
public class Conditional_Logic_P13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a month number (1-12): ");
            int monthNumber = scanner.nextInt();

            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (monthNumber >= 1 && monthNumber <= 12) {
                System.out.println("Number of days in month " + monthNumber + " is " + daysInMonth[monthNumber - 1]);
            } else {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        }
    }
