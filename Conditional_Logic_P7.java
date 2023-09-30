

//Write a program to count total number of notes in given amount.

import java.util.Scanner;
public class Conditional_Logic_P7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the total amount in Taka: ");
            int amount = scanner.nextInt();

            int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

            for (int note : notes) {
                int count = amount / note;
                if (count > 0) {
                    System.out.println("Number of " + note + " Taka notes: " + count);
                }
                amount = amount % note;
            }
        }
    }
