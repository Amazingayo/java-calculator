package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n=== JAVA CALCULATOR ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Choose an operation: ");

            String choiceInput = input.nextLine().trim();

            int choice;

            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println(
                        "Please enter a number from 1 to 100.");
                continue;
            }

            if (choice == 100) {
                System.out.println("Calculator closed.");
                break;
            }

            if (choice < 1 || choice > 100) {
                System.out.println(
                        "Please enter a number from 1 to 100.");
                continue;
            }

            double num1;
            double num2;

            try {
                System.out.print("Enter the first number: ");
                num1 = Double.parseDouble(input.nextLine().trim());

                System.out.print("Enter the second number: ");
                num2 = Double.parseDouble(input.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid number. Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println(
                                "Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }
        }

        input.close();
    }
}