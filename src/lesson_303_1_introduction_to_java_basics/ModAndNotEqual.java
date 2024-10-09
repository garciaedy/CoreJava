package lesson_303_1_introduction_to_java_basics;

public class ModAndNotEqual {

    public static void main(String[] args){
        int number = 10;

        if (number % 2 !=0) {
            System.out.printf(number + "is not even");
        }else{
            System.out.printf(number + "is even");
        }

        int num = 30;
        int divdent = 2;
        int remainder = num % divdent;
        System.out.println("The remainder when " + num+ " is divided by" + divdent + " is:" + remainder);
        // Check if the number is not odd
        if (remainder != 1) { // Use != to check if remainder is not 1
            System.out.println(num + " is not odd."); // If true, print message
        } else {
            System.out.println(num + " is odd."); // Otherwise, print message
        }


    }
}
