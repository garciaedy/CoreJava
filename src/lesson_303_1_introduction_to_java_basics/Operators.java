package lesson_303_1_introduction_to_java_basics;

public class Operators {

    public static void main(String[] args){
        int a = 11;
        int b = 2;
    int remainder = a % b;
//        System.out.println(STR." The remainder of 30 % 21 is: \{remainder}");


        boolean lightOn = true;
        lightOn = !lightOn; // Toggle the state
        System.out.println("Light is now on: " + lightOn);

        boolean isWeekend = false;
        boolean isHoliday = false;



        // Using NOT operator
        if (!isWeekend && !isHoliday) {
            System.out.println("It's a working day.");

            int num5 = 23; // Declare an integer variable 'num5' and assign it the value 23
            int num6 = 7;
            boolean condition5 = (num5 < 25); // Check if 'num5' is less than 25 (true)
            boolean condition6 = (num6 > 6);  // Check if 'num6' is greater than 6 (false)
            boolean result3 = condition5 && condition6; // One condition is false, so result3 is false
            System.out.println("Condition5 && Condition6: " + result3); // Output: Condition5 && Condition6: false

        }

    }


}
