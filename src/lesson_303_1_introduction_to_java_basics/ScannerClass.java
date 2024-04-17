package lesson_303_1_introduction_to_java_basics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter you name: ");
//        String name = scanner.nextLine(); //reads  line of text
//        System.out.println("Hello, " + name);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your age: ");
//        int age = scanner.nextInt();
//        System.out.println("you are " + age + " years old ");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your first and last name: ");
//        String firstName = scanner.next();  // Reads a single word
//        String lastName = scanner.next();   // Reads the next word
//        System.out.println("Your full name is " + firstName + " " + lastName);

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number: "); // Prompt for the first number
        int firstNumber = scanner.nextInt();       // Read first integer
        System.out.println("Enter second number: "); // Prompt for the second number
        int secondNumber = scanner.nextInt();      // Read second integer
        int sum = firstNumber + secondNumber;      // Calculate sum of both integers
        System.out.println("The sum is: " + sum);  // Print the sum
        scanner.close();


    }
}
