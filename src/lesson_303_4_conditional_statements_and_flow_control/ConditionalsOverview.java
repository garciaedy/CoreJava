package lesson_303_4_conditional_statements_and_flow_control;

public class ConditionalsOverview {
    public static void main(String[] args){
        /*
         * In Java, conditional statements allow you to execute a block of code based on -
         * whether a condition is true or false.
         * The most commonly used conditional statement is the if-else statement.
         * The syntax of the if-else statement is as follows:
         *
         * if (condition) {
         *     // code to be executed if the condition is true
         * } else {
         *     // code to be executed if the condition is false
         * }
         *
         * - The condition inside the parentheses is evaluated.
         * - If the condition is true, the code inside the first block (if block) is executed.
         * - If the condition is false, the code inside the second block (else block) is executed.
         */

        int number = 10;  // Variable declaration and initialization

        // Check if the number is positive
        if (number > 0) {
            // This block of code will be executed if the condition is true
            System.out.println("The number is positive.");
        } else {
            // This block of code will be executed if the condition is false
            System.out.println("The number is not positive.");
        }

        // Add a blank line for separation
        System.out.println("");

        // Another example with a different condition
        number = -5;  // Changing the value of the variable

        // Check if the number is positive
        if (number > 0) {
            // This block of code will be executed if the condition is true
            System.out.println("The number is positive.");
        } else {
            // This block of code will be executed if the condition is false
            System.out.println("The number is not positive.");
        }

        // Add a blank line for separation
        System.out.println("");

        /*
         * Explanation:
         * 1. We declare and initialize a variable named 'number' with the value 10.
         * 2. The first if statement checks if 'number' is greater than 0.
         *    - Since 10 is greater than 0, the condition is true.
         *    - The message "The number is positive." is printed to the console.
         * 3. We then change the value of 'number' to -5.
         * 4. The second if statement checks if 'number' is greater than 0.
         *    - Since -5 is not greater than 0, the condition is false.
         *    - The message "The number is not positive." is printed to the console.
         *
         * The if-else statement is a fundamental concept in programming, allowing for decision-making based on conditions.
         * It helps in controlling the flow of the program by executing different blocks of code based on whether the condition is true or false.
         */

        /*
         * In Java, you can use boolean variables and String values in conditional statements to control the flow of your program.
         * This allows you to make decisions based on the value of a boolean variable or the content of a String variable.
         */

        boolean isRaining = true;  // Variable declaration and initialization

        // Check if it is raining
        if (isRaining) {
            // This block of code will be executed if isRaining is true
            System.out.println("It's raining. Don't forget to take an umbrella!");
        } else {
            // This block of code will be executed if isRaining is false
            System.out.println("It's not raining. Have a nice day!");
        }

        // Add a blank line for separation
        System.out.println("");

        // Example using a String variable in an if-else statement

        String weather = "sunny";  // Variable declaration and initialization

        // Check the weather condition
        if (weather.equals("sunny")) {
            // This block of code will be executed if weather is "sunny"
            System.out.println("The weather is sunny. It's a great day for a walk!");
        } else if (weather.equals("rainy")) {
            // This block of code will be executed if weather is "rainy"
            System.out.println("It's rainy. Don't forget to take an umbrella!");
        } else if (weather.equals("cloudy")) {
            // This block of code will be executed if weather is "cloudy"
            System.out.println("The weather is cloudy. You might want to take a light jacket.");
        } else {
            // This block of code will be executed if none of the above conditions are true
            System.out.println("Weather condition is unknown. Be prepared for anything!");
        }

        // Add a blank line for separation
        System.out.println("");

        /*
         * Explanation:
         * 1. We declare and initialize a boolean variable named 'isRaining' with the value true.
         * 2. The first if statement checks if 'isRaining' is true.
         *    - Since 'isRaining' is true, the message "It's raining. Don't forget to take an umbrella!" is printed to the console.
         * 3. We declare and initialize a String variable named 'weather' with the value "sunny".
         * 4. The second if-else statement checks the value of the 'weather' variable using the equals() method.
         *    - The equals() method is used to compare the content of the String variable.
         *    - If 'weather' equals "sunny", the message "The weather is sunny. It's a great day for a walk!" is printed.
         *    - If 'weather' equals "rainy", the message "It's rainy. Don't forget to take an umbrella!" is printed.
         *    - If 'weather' equals "cloudy", the message "The weather is cloudy. You might want to take a light jacket." is printed.
         *    - If none of the above conditions are true, the message "Weather condition is unknown. Be prepared for anything!" is printed.
         *
         * Using boolean variables and String values in conditional statements allows you to make more complex decisions in your programs.
         * This helps in controlling the program's flow based on various conditions, making your code more dynamic and responsive to different scenarios.
         */

        // Example using a String variable with switch-case statement for better readability

        String weather2 = "sunny";  // Variable declaration and initialization

        // Check the weather condition using switch-case statement for better readability
        switch (weather2) {
            case "sunny":
                // This block of code will be executed if weather is "sunny"
                System.out.println("The weather is sunny. It's a great day for a walk!");
                break;
            case "rainy":
                // This block of code will be executed if weather is "rainy"
                System.out.println("It's rainy. Don't forget to take an umbrella!");
                break;
            case "cloudy":
                // This block of code will be executed if weather is "cloudy"
                System.out.println("The weather is cloudy. You might want to take a light jacket.");
                break;
            default:
                // This block of code will be executed if none of the above conditions are true
                System.out.println("Weather condition is unknown. Be prepared for anything!");
                break;
        }

        // Add a blank line for separation
        System.out.println("");

        /*
         * Explanation:
         * The switch-case statement checks the value of the 'weather' variable.
         * - The switch-case statement provides a more readable and maintainable way to check multiple conditions.
         * - If 'weather' is "sunny", the message "The weather is sunny. It's a great day for a walk!" is printed.
         * - If 'weather' is "rainy", the message "It's rainy. Don't forget to take an umbrella!" is printed.
         * - If 'weather' is "cloudy", the message "The weather is cloudy. You might want to take a light jacket." is printed.
         * - If none of the above conditions are true, the default case executes and the message "Weather condition is unknown. Be prepared for anything!" is printed.
         *
         * Using the switch-case statement with String values allows you to handle multiple conditions more cleanly and efficiently than using multiple if-else statements.
         * This improves the readability and maintainability of your code, especially when dealing with many possible values for a single variable.
         */

        // Nested if-else statements

        int age = 25;

        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            if (age < 65) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior citizen.");
            }
        }

        // Add a blank line for separation
        System.out.println("");

        /*
         * Explanation:
         * 1. We declare and initialize a variable named 'age' with the value 25.
         * 2. The outer if-else statement checks if 'age' is less than 18.
         *    - If true, it prints "You are a minor."
         * 3. If the outer condition is false, it checks the inner if-else statement.
         *    - If 'age' is less than 65, it prints "You are an adult."
         *    - Otherwise, it prints "You are a senior citizen."
         *
         * Nested if-else statements allow for more complex decision-making by placing one if-else statement inside another.
         */

        // Ternary operator

        int score = 85;
        String grade = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Your grade is: " + grade);

        // Add a blank line for separation
        System.out.println("");

        /*
         * Explanation:
         * 1. We declare and initialize a variable named 'score' with the value 85.
         * 2. We use the ternary operator to assign a value to the 'grade' variable.
         *    - If 'score' is greater than or equal to 60, 'grade' is assigned "Pass".
         *    - Otherwise, 'grade' is assigned "Fail".
         * 3. The result is printed to the console.
         *
         * The ternary operator is a shorthand for simple if-else statements.
         * It is particularly useful for assigning values based on a condition.
         */

        // Logical operators

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;

        if (hasHighIncome && hasGoodCredit) {
            System.out.println("Loan approved.");
        } else {
            System.out.println("Loan denied.");
        }

        // Add a blank line for separation
        System.out.println("");

        /*
         * Explanation:
         * 1. We declare and initialize two boolean variables: 'hasHighIncome' and 'hasGoodCredit'.
         * 2. The if statement checks if both conditions are true using the logical AND operator (&&).
         *    - If both 'hasHighIncome' and 'hasGoodCredit' are true, it prints "Loan approved."
         *    - Otherwise, it prints "Loan denied."
         *
         * Logical operators (&&, ||, !) allow you to combine multiple conditions in a single if statement.
         * This helps in making decisions based on multiple criteria.
         */
    }
}
