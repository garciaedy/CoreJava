package lesson_303_1_introduction_to_java_basics;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Fahrenheit:  ");
    double fahrenheit = input.nextDouble();

    //Converting Fahrenheit into Celsius
    double celsius = (5.0 / 9) * (fahrenheit -32);
    System.out.println("fahrenheit" + fahrenheit + " is " + celsius + " in Celsius ");
}}
