package lesson_303_1_introduction_to_java_basics;

import java.util.Scanner;

public class ScannerC {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your name: ");
//        String name =  scanner.nextLine();
//        System.out.println("Your name is: " + name);

        // Example 1: Sum of Numbers from 1 to N
//        System.out.print("Example 1 - Enter a positive integer N: ");
//        int n = scanner.nextInt(); // Read integer N from the user
//        int sum = 0;
//        for (int i = 1; i <= n; i++) { // Loop from 1 to N
//            sum += i; // Add current number to sum
//        }
//        System.out.println("Sum from 1 to " + n + " is: " + sum);

        double usage = 150; // Electricity usage in kWh
        if (usage < 100) {
            System.out.println("Tariff rate: $0.10 per kWh");
        } else if (usage <= 200) {
            System.out.println("Tariff rate: $0.15 per kWh");
        } else {
            System.out.println("Tariff rate: $0.20 per kWh");
        }






    }
}
