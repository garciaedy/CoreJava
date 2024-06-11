package lesson_303_3_java_wrapper_class_math_character_and_string_class;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args){
        // create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string");

        //read the input string
        String name = scanner.nextLine();

        //print the length of the string
        System.out.println("the length of the entered string is" + " " + name.length());

        // Convert the string to upper case and print it
        String upperCaseName = name.toUpperCase();
        System.out.println("The string in upper case is: " + upperCaseName);

        // Convert the string to lower case and print it
        String lowerCaseName = name.toLowerCase();
        System.out.println("The string in lower case is: " + lowerCaseName);

        // Close the scanner
        scanner.close();


    }

}
