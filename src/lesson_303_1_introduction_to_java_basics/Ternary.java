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
//        int score = 75;
//        String result = (score >=75)? "you are passing" : "you are about fail";
//        System.out.println("The result is " + result);
//
//        int speed =76;
//
//        String speedResult = (speed <= 65)? "you are ok": "you are speeding";
//        System.out.println(" the current speed is " + speed+speedResult);
//
//        int age = 17;
//        String ageToVote = (age>= 18)? "you can vote" : "you cannot vote you to young ";
//        System.out.println(age +" The current age will determine if you can vote: " + ageToVote);
//
//        int year= 2024;
//
//        String leapYear = ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0)? "lis a eap year": "is not a leap year";
//        System.out.println("the provided year " + year+ leapYear );
//
//
//        int pages = 150;
//
//        String pageResult = (pages > 200)? " that's a big boy book" : "it's a baby book";
//        System.out.println("The book you are reading has pages" + pageResult );
//
//        int driveAge = 16;
//
//        String driveAgeResult=(driveAge >= 18)? "You can drive" : "you are way to young, gotta wait";
//        System.out.println("The person is " + driveAge +driveAgeResult);
//
//        int numType = 12;
//        String numTypeResult = (numType >=0)? "the number is positive" : "the number is neg";
//        System.out.println("The give number" + numType+ " Is" + numTypeResult);
//
//        int creditScore = 768;
//        String resultCreditScore = (creditScore >= 750) ? "you have a great score"
//                : (creditScore >= 700) ? "you have an ok score"
//                : "you need to work on the score";
//        System.out.println("Your current credit score is " + creditScore + ", therefore " + resultCreditScore);


        int number1 =19;
        String result1 =(number1 % 2 ==0)? "even" : "odd";
        System.out.println("The Number: " + number1 + " is: " + result1);

        int age = 3;
        String result2 = (age >= 18)? "Adult" : "Minor";
        System.out.println("The person's age is: " +age + " there for you are a " + result2);

        int year = 2020;
        String result3 =(year % 4 ==0)? "Leap Year" : " Not A leap year";
        System.out.println("Year " + year + " is " + result3); // Print the result

        int temperature = 75;

// Nested ternary statements to evaluate different temperature ranges
        // 1. If the temperature is between 85 and 100 (inclusive of 85), it's considered "way too hot".
String result4 = (temperature > 85 && temperature <= 100) ? "way too hot" :
        // 2. If it's between 74 and 85 (inclusive of 74 but not 85), it's considered "warm".
        (temperature > 74 && temperature <= 85) ? "warm" :
                // 3. If it's between 65 and 74 (inclusive of both), it's "perfect temperature".
                (temperature >= 65 && temperature <= 74) ? "perfect temperature" :
                        // 4. If it's between 0 and 65 (inclusive of 0 but not 65), it's "way too cold".
                        (temperature >= 0 && temperature < 65) ? "way too cold" :
                                // 5. If the temperature doesn't fall within any of these ranges, it outputs "Invalid temperature range".
                                "It's freezing";
        System.out.println("Temperature: " + temperature + "°F - " + result4); // Print the result

        int score = 89;
        // 1. If the score is between 91 and 100, it's an 'A'.
        String result5 = (score > 90 && score <= 100) ? "You got an 'A'" :
                // 2. If the score is between 81 and 90, it's a 'B'.
                (score > 80 && score <= 90) ? "You got a 'B'" :
                        // 3. If the score is between 71 and 80, it's a 'C'.
                        (score > 70 && score <= 80) ? "You got a 'C'" :
                                // 4. If the score is between 0 and 69, it's an 'F'.
                                (score <= 69) ? "You got an 'F', you need to retake the course" :
                                        // 5. If the score is outside the range of 0 to 100, it returns "Invalid score".
                                        "Invalid score";
        System.out.println(result5);

        int number2 =-5;
        String result6 = (number2 >= 0)? "Positive" : "Negative";
        System.out.println(number2 + " is a  " + result6 + " number");

    }
}
