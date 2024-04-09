package lesson_303_5_iteration_statements_loops;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){

        int count = 0;
        while(count <10){
            System.out.println("Hellow World");
               count++;
        }

        System.out.println("----------");
        System.out.println("----------");

        int sum =0, i =1;
        while(i< 10){
            sum = sum +i;
            i++;

        }
        System.out.println("sum is " + sum);

        System.out.println("----------");
        System.out.println("----------");

        int number1 = (int)(Math.random() *10);
        int number2 = (int)(Math.random() *10);

        // create scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("what is" + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();


        while(number1 + number2 != answer){
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ? ");
            answer = input.nextInt();
        }
        System.out.println("You got it");

    }
}
