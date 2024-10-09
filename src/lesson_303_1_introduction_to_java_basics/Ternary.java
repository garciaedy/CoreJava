package lesson_303_1_introduction_to_java_basics;

public class Ternary {
    public static void main(String[] args){
//        int number = 10;
//        String result = (number % 2 ==0) ? "even" :"odd";
//        System.out.printf(number + " is" + result);

//        if (number % 2 == 0) {
//            System.out.printf("%d is even%n", number); // If the remainder is 0, print that the number is even
//        } else {
//            System.out.printf("%d is odd%n", number); // Otherwise, print that the number is odd
//        }

//        int age = 18;
//        String result = (age >=18)? "adult" :"minor";
//        System.out.println("the person is an  " + result);
/**
//         Multiple ternary
        int temperature = 70;
        // Check if the temperature is between 65 and 73 degrees
        String result1 = (temperature >= 73) ? "it's hot" :
                (temperature < 65) ? "it's too cold" : "it's perfect"; // Temperature is between 65 and 73 degrees
        // Print the result
        System.out.println("The temperature is " + result1);

/// Way better
        if (temperature >= 73) {
            System.out.println("The temperature is it's hot");
        } else if (temperature < 65) {
            System.out.println("The temperature is it's too cold");
        } else {
            System.out.println("The temperature is it's perfect"); // Temperature is between 65 and 73 degrees
        }

        //OR
        String result2;

        if (temperature >= 73) {
            result2 = "it's hot";
        } else if (temperature < 65) {
            result2 = "it's too cold";
        } else {
            result2 = "it's perfect"; // Temperature is between 65 and 73 degrees
        }

        System.out.println("The temperature is " + result2);
**/
        int score = 75;
        String result = (score >=75)? "you are passing" : "you are about fail";
        System.out.println("The result is " + result);

        int speed =76;

        String speedResult = (speed <= 65)? "you are ok": "you are speeding";
        System.out.println(" the current speed is " + speed+speedResult);

        int age = 17;
        String ageToVote = (age>= 18)? "you can vote" : "you cannot vote you to young ";
        System.out.println(age +" The current age will determine if you can vote: " + ageToVote);

        int year= 2024;

        String leapYear = ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0)? "lis a eap year": "is not a leap year";
        System.out.println("the provided year " + year+ leapYear );


        int pages = 150;

        String pageResult = (pages > 200)? " that's a big boy book" : "it's a baby book";
        System.out.println("The book you are reading has pages" + pageResult );

        int driveAge = 16;

        String driveAgeResult=(driveAge >= 18)? "You can drive" : "you are way to young, gotta wait";
        System.out.println("The person is " + driveAge +driveAgeResult);

        int numType = 12;
        String numTypeResult = (numType >=0)? "the number is positive" : "the number is neg";
        System.out.println("The give number" + numType+ " Is" + numTypeResult);

        int creditScore = 768;
        String resultCreditScore = (creditScore >= 750) ? "you have a great score"
                : (creditScore >= 700) ? "you have an ok score"
                : "you need to work on the score";
        System.out.println("Your current credit score is " + creditScore + ", therefore " + resultCreditScore);





    }
}
