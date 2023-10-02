
//Write a program to enter any number and print its reverse
import java.util.Scanner;
public class Loop_P10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            System.out.println("Reverse of the number is: " + reversedNum);
        }
    }
