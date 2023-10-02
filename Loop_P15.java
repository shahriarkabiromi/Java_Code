
//Program to enter any number and print all factors of the numbe
import java.util.Scanner;
public class Loop_P15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();

            System.out.print("Factors of " + num + " are: ");

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
