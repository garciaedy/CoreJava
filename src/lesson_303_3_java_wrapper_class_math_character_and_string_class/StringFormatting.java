package lesson_303_3_java_wrapper_class_math_character_and_string_class;

public class StringFormatting {
    public static void main(String[] args){
        String user = "Edy";
        int points = 120;
        String message = String.format("%d has scored %s points", points, user);
        System.out.println(message); // Outputs: Edy has scored 120 points
    }
}
