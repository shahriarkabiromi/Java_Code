
//Program to input marks of five subjects (Physics, Chemistry, Biology, Mathematics, and Computer) and calculate the percentage and grade

import java.util.Scanner;
public class Conditional_Logic_P18 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter marks in Physics: ");
            int physics = scanner.nextInt();

            System.out.print("Enter marks in Chemistry: ");
            int chemistry = scanner.nextInt();

            System.out.print("Enter marks in Biology: ");
            int biology = scanner.nextInt();

            System.out.print("Enter marks in Mathematics: ");
            int mathematics = scanner.nextInt();

            System.out.print("Enter marks in Computer: ");
            int computer = scanner.nextInt();

            int totalMarks = physics + chemistry + biology + mathematics + computer;
            double percentage = (totalMarks / 500.0) * 100;

            System.out.println("Percentage: " + percentage + "%");

            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
