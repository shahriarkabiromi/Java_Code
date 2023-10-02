

//Program to enter any number and check whether the number is a palindrome or not
import java.util.Scanner;
public class Loop_P11 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int originalNum = num;
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome.");
            } else {
                System.out.println(originalNum + " is not a palindrome.");
            }
        }
    }
