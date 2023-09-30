
//Program to input week number and print the weekday
import java.util.Scanner;
public class Conditional_Logic_P12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a week number (1-7): ");
            int weekNumber = scanner.nextInt();

            String[] daysOfWeek = {
                    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            };

            if (weekNumber >= 1 && weekNumber <= 7) {
                System.out.println("Day of the week is " + daysOfWeek[weekNumber - 1]);
            } else {
                System.out.println("Invalid week number. Please enter a number between 1 and 7.");
            }
        }
    }
