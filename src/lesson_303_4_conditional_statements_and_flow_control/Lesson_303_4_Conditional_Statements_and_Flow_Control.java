package lesson_303_4_conditional_statements_and_flow_control;

public class Lesson_303_4_Conditional_Statements_and_Flow_Control {
    public static void main(String[] args) {
        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");


//        int number = 10;
//        if(number > 5){
//            System.out.println("The number is greater than 5");
//
//        }
//        System.out.println( "     ");
//        System.out.println( "     <-------------------->    ");
//        int age = 18;
//        boolean hasLicense = false;
//
//        if (age >= 18 && hasLicense) {
//            System.out.println("You are eligible to drive.");
//        }else if(age< 18){
//            System.out.println("You are not eligible to drive because you are under 18 years old." +  age);
//        }else if (!hasLicense) {
//            System.out.println("You are not eligible to drive because you don't have a valid license." + hasLicense );
//        }

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

//        int number = 4;
//        if(number % 2 ==0){
//            System.out.println(" the number is even " + number);
//        }else{
//            System.out.println("the number is odd" + number);
//        }


        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

//        int temperature = 49;
//        if (temperature >= 70) {
//            System.out.println("It's way too hot at " + temperature + " degrees.");
//        } else if (temperature <= 69 && temperature >= 50) {
//            System.out.println("It's cool.");
//        } else if (temperature <= 49) {
//            System.out.println("It's way too cold.");
//        }


        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

//        String iPhoneColor = "lightblue";
//        if( iPhoneColor == "lightblue"){
//            System.out.println("thats the iphone you got");
//        }else{
//            System.out.println("that's not it");
//        }

//
//        System.out.println( "     ");
//        System.out.println( "     <-------------------->    ");
//
//        int number1 = 9;
//        if(number1 >0){
//            System.out.println("Positive number;");
//        }

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

//        int number2 =-2;
//
//        if(number2 >=0){
//            System.out.println("Its a pos num");
//        }else{
//            System.out.println("its a neg");
//        }


        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");
//
//        int score = 87;
//
//        if (score >=90 ){
//            System.out.println("you got an A");
//        }else if (score >= 80 ){
//            System.out.println("you got a B");
//        }else if(score >= 70){
//            System.out.println("you got a c");
//        } else { // Handle scores less than 70
//            System.out.println("You need to improve"); // Print message for scores below 70
//        }

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

//        int score2 = 70; // Initialize variable score with value 70
//
//        if (score2 >= 90) { // Check if score is greater than or equal to 90
//            System.out.println("You got an A"); // Print message if condition is true
//        } else if (score2 >= 80 && score2 < 90) { // Check if score is between 80 and 89
//            System.out.println("You got a B"); // Print message if condition is true
//        } else if (score2 >= 70 && score2 < 80) { // Check if score is between 70 and 79
//            System.out.println("You got a C"); // Print message if condition is true
//        } else { // Handle scores less than 70
//            System.out.println("You need to improve"); // Print message for scores below 70
//        }
//        System.out.println( "     ");
//        System.out.println( "     <-------------------->    ");

//        int score3 = 89;
//        if(score3 >= 90){
//            System.out.println("Grade A");
//        }else if(score3 >= 80){
//            System.out.println("Grade B");
//        }else if(score3 >= 70){
//            System.out.println("Grade c");
//        }else if (score3 >= 60){
//            System.out.println("Grade d");
//
//        }else {
//            System.out.println("you failed");
//        }



        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

//        int a1 = 5;
//        int b2 = 10;
//        if(a1 >2 && b2 <15){
//            System.out.println("the condition is tru");
//        }


        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        int number3 = 34;
//        if(number3 >30){
//            System.out.println("the Number is greater than 30");
//        }else if(number3 ==25){
//            System.out.println("the number is 25");
//        }else {
//            System.out.println("the number is not less than 30 and not equal to 25");
//        }

        // Ternary Operator
//        String message=(number3 < 30) ? "the Number is greater than 30":
//                (number3 == 34) ? "the number is 34":
//                        "the number is less than 30 and not eqaul 25 ";
//        System.out.println(message);

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        boolean isStudent;
        int age = 18;

        if(isStudent = true  && age ==18){
            System.out.println("The person is a student");
        }else {
            System.out.println("the person is not a student");
        }

        //Ternary Operator
        String message = isStudent ? "Is a student" : "Is not a student"; // Determine message using ternary operator
        System.out.println(message); // Print the determined message
//
//        boolean isStudent = true; // Initialize boolean variable isStudent with value true
//        int age = 18; // Initialize int variable age with value 18
//
//        String message = (isStudent && age == 18) ? "The person is a student" : "The person is not a student"; // Determine message using ternary operator
//        System.out.println(message); // Print the determined message

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        int height =181;
        if(height >= 180){
            System.out.println("you are tall");
        }else{
            System.out.println("you are not tall");
        }

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");
        int a = 20;
        int b = 20;
        int sum = a + b;

        if(sum == 30){
            System.out.println("Sum is 30");
        }else if(sum >31){
            System.out.println("too high the sum");
        }else{
            System.out.println("the sum is lower");
        }
        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        int number2 =3;
        if(number2 %2 ==0){
            System.out.println("the number is even");
        }else {
            System.out.println("The number is odd");
        }
        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        int scoreL = 5;
        if(scoreL >=90 || scoreL >= 70){
            System.out.println("good score");
        }else{
            System.out.println("Reg score");
        }
        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        int income = 50000;
        int expenses =30000;
        if(income> expenses && (income-expenses)> 10000){
            System.out.println("good saving");

        }else{
            System.out.println("Savings are low");
        }

        System.out.println( "     ");
        System.out.println( "    <if-else with Leap Year Calculation>    ");

        int year = 2024;
        if((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0) ){
            System.out.println("The" + year + "is a leap year");
        }else {
            System.out.println("is not a leap year");
        }
///         or
//        int year = 2024;
//
//        if (year % 400 == 0) {
//            // If the year is divisible by 400, it is a leap year
//            System.out.println(year + " is a leap year");
//        } else if (year % 100 == 0) {
//            // If the year is divisible by 100 but not by 400, it is not a leap year
//            System.out.println(year + " is not a leap year");
//        } else if (year % 4 == 0) {
//            // If the year is divisible by 4 but not by 100, it is a leap year
//            System.out.println(year + " is a leap year");
//        } else {
//            // If the year is not divisible by 4, it is not a leap year
//            System.out.println(year + " is not a leap year");
//        }


        System.out.println( "     ");
        System.out.println( "  if-else with Loan Approval   <-------------------->    ");

        int creditScore = 789;
        double annualIncome = 40000;

        if(creditScore >= 700 || annualIncome >= 50000){
            System.out.println("Loan approved, your credit score  is" + creditScore + "and your Anual income is" +annualIncome);
        }else{
            System.out.println("Load denied your credit score  is" + creditScore + "and your Anual income is" +annualIncome);
        }

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");

        System.out.println( "     ");
        System.out.println( "     <-------------------->    ");
    }
}