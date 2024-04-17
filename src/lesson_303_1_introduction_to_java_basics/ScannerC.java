package lesson_303_1_introduction_to_java_basics;

import java.util.Scanner;

public class ScannerC {
    public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);
     System.out.println("enter your name: ");
     String name = scanner.nextLine();
     System.out.println("Hello, " + name + "!");
     scanner.close();


    }
}
