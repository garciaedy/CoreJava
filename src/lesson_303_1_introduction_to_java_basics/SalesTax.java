package lesson_303_1_introduction_to_java_basics;

import java.util.Scanner;

public class SalesTax {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.print("Sales tax is $" + (int)(tax*100) / 100);
    }
}
