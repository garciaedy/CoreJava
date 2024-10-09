package lesson_303_1_introduction_to_java_basics;

public class NotEquals {
    public static void main(String[] args){
        int number =10;
        if(number != 5){
            System.out.println(number + "is not equal to 5");
        }


        String name = "Edy";
        if(!name.equals("Fre")){
            System.out.printf(name + " is not Fre");
        }

        int age = 25;

        if(age != 30){
            System.out.println(age + " age is not 30");
        }

        String str = "Java";
        if(!str.equals("")){
            System.out.println("\"" + str + "\" is not equal to an empty string");
        }


        int chapters = 30; // Initialize chapters

        // Check if chapters is less than 1 or greater than 30
        if (chapters < 1 || chapters > 30) { // Use || to combine two conditions
            System.out.println("Number of chapters is invalid."); // If either condition is true, print message
        }
    }
}
