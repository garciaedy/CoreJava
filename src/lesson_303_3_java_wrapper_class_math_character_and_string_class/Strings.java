package lesson_303_3_java_wrapper_class_math_character_and_string_class;

public class Strings {
    public static void main(String[] args) {
        // Prompt: Check if a string contains only digits
        String digitsOnly = "0123456789";

        boolean isDigitsOnly = true;

        for(int i=0; i<digitsOnly.length(); i++) {
            if(!Character.isDigit(digitsOnly.charAt(i))) {
                isDigitsOnly = false;
                break;
            }
        }
        System.out.println("digits only: " + isDigitsOnly);

    }



}
