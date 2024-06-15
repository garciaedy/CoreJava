package lesson_303_3_java_wrapper_class_math_character_and_string_class;

public class StringExamples {

    public static void main(String[] args) {
        // Example 1: Creating a string using string literal
        String simple = "Hello World";
        System.out.println(simple); // Outputs: Hello World

        // Example 2: Converting to upper case
        String upper = simple.toUpperCase(); // Converts all characters to uppercase
        System.out.println(upper); // Outputs: HELLO WORLD

        // Example 3: Converting to lower case
        String lower = simple.toLowerCase(); // Converts all characters to lowercase
        System.out.println(lower); // Outputs: hello world

        // Example 4: Getting the length of a string
        int length = simple.length(); // Returns the length of the string
        System.out.println(length); // Outputs: 11

        // Example 5: Character at a specific index
        char letter = simple.charAt(6); // Returns the character at index 6
        System.out.println(letter); // Outputs: W

        // Example 6: Substring from a string
        String sub = simple.substring(6); // Extracts substring from index 6 to end
        System.out.println(sub); // Outputs: World

        // Example 7: Substring with start and end index
        String subPart = simple.substring(0, 5); // Extracts substring from index 0 to 5
        System.out.println(subPart); // Outputs: Hello

        // Example 8: Replacing characters
        String replaced = simple.replace('l', 'p'); // Replaces 'l' with 'p' in the string
        System.out.println(replaced); // Outputs: Heplo Worpd

        // Example 9: Contains a sequence
        boolean contains = simple.contains("Hello"); // Checks if "Hello" is in the string
        System.out.println(contains); // Outputs: true

        // Example 10: Equality of strings
        boolean equals = "Hello World".equals(simple); // Checks if "Hello World" is exactly the same as simple
        System.out.println(equals); // Outputs: true

        // Example 11: Splitting strings
        String[] parts = "apple,banana,cherry".split(","); // Splits the string into parts at commas
        for (String part : parts) {
            System.out.println(part); // Outputs: apple, banana, cherry
        }

    }
}
