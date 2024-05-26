package Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            // Reading an integer
            System.out.println("Enter an interger");
            int intValue = scanner.nextInt();
        System.out.println("You have entered" + " " +  intValue);

        // Reading a string
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered: " + stringValue);

        // Reading a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered: " + booleanValue);

        // 2. Mixed Data Types

        // Reading multiple data types in a single input sequence
        scanner.nextLine(); // Clear the buffer by consuming the leftover newline character
        System.out.print("Enter a string, an integer, and a boolean separated by spaces: "); // Prompt the user to enter multiple values
        String mixedString = scanner.next(); // Read the string input from the user
        int mixedInt = scanner.nextInt(); // Read the integer input from the user
        boolean mixedBoolean = scanner.nextBoolean(); // Read the boolean input from the user
        System.out.println("You entered: " + mixedString + ", " + mixedInt + ", " + mixedBoolean); // Print the entered values


    }

}
