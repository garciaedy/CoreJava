package lesson_303_1_introduction_to_java_basics;

import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
System.out.println("eneter amount indouble, for example 23.33");
        double amount = scan.nextDouble();

        int remainingAmount =(int)(amount * 100);

        //find the number of one dollars

        int numberOfOneDollars = remainingAmount/ 100;
        remainingAmount =remainingAmount %100;

        //find the number of quaters

        int  numberOfQuaters = remainingAmount;
        remainingAmount = remainingAmount %25;

        int numberOfDimes = remainingAmount /10;
        remainingAmount = remainingAmount %10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount %5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your Amount " + amount + "consist of ");

        System.out.println(" " + numberOfOneDollars + " dolalrs");

        System.out.println(" " + numberOfQuaters + " quaters");

        System.out.println(" " + numberOfDimes + "dimes");

        System.out.println(" " + numberOfNickels + "nickels");

        System.out.println(" " + numberOfPennies + "pennies");





    }
}
