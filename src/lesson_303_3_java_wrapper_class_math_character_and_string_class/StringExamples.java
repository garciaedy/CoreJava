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

        // Example 12: Index of a substring
        int index = simple.indexOf("World"); // Finds the index of the substring "World"
        System.out.println(index); // Outputs: 6

        // Example 13: Last index of a character
        int lastIndex = simple.lastIndexOf('o'); // Finds the last index of 'o'
        System.out.println(lastIndex); // Outputs: 7

        // Example 14: Starts with a prefix
        boolean starts = simple.startsWith("Hello"); // Checks if the string starts with "Hello"
        System.out.println(starts); // Outputs: true

        // Example 15: Ends with a suffix
        boolean ends = simple.endsWith("World"); // Checks if the string ends with "World"
        System.out.println(ends); // Outputs: true

        // Example 16: Immutable strings
        String original = "original";
        original.replace('r', 'p'); // Attempting to replace 'r' with 'p' does not change original
        System.out.println(original); // Outputs: original

        // Example 17: Using new with strings
        String newString = new String("New String"); // Explicitly creates a new string object
        System.out.println(newString); // Outputs: New String

        // Example 18: Comparing using ==
        String a = "test";
        String b = "test";
        System.out.println(a == b); // True because they refer to the same object in the string pool

        // Example 19: Using StringBuilder for mutable strings
        StringBuilder sb = new StringBuilder("start"); // Creates a mutable string
        sb.append(" end"); // Appends " end" to the StringBuilder
        System.out.println(sb.toString()); // Outputs: start end

        // Example 20: Reversing a string using StringBuilder
        StringBuilder reverse = new StringBuilder("reverse");
        reverse.reverse(); // Reverses the characters in the StringBuilder
        System.out.println(reverse.toString()); // Outputs: esrever

        // Example 21: Inserting into StringBuilder
        StringBuilder insert = new StringBuilder("hellworld");
        insert.insert(4, "o "); // Inserts "o " at index 4
        System.out.println(insert.toString()); // Outputs: hello world

        // Example 22: Deleting from StringBuilder
        StringBuilder delete = new StringBuilder("hello world");
        delete.delete(5, 11); // Deletes characters from index 5 to 11
        System.out.println(delete.toString()); // Outputs: hello

        // Example 23: Replacing in StringBuilder
        StringBuilder sbReplace = new StringBuilder("hello");
        sbReplace.replace(1, 3, "a"); // Replaces characters from index 1 to 3 with "a"
        System.out.println(sbReplace.toString()); // Outputs: halo

        // Example 24: Converting numbers to strings
        int num1 = 100;
        String numStr = String.valueOf(num1); // Converts integer to string
        System.out.println(numStr); // Outputs: "100"

        // Example 25: Checking if string is empty
        String empty = "";
        System.out.println(empty.isEmpty()); // True because the string is empty

        // Example 26: Trim leading and trailing spaces
        String spaces = "   trim   ";
        System.out.println(spaces.trim()); // Outputs: "trim"

        // Example 27: Converting string to char array
        char[] chars = simple.toCharArray(); // Converts string to a char array
        for (char c : chars) {
            System.out.print(c); // Prints each character
        }
        System.out.println();

        // Example 28: Case insensitive comparison
        String caseA = "Case";
        String caseB = "case";
        System.out.println(caseA.equalsIgnoreCase(caseB)); // Outputs: true

        // Example 29: Regular expression matching
        String regex = "123abc";
        System.out.println(regex.matches("\\d+\\w+")); // Outputs: true because regex matches pattern of digits followed by letters
// Example 31: Convert String to Integer
        String numberStr = "1234";
        int number = Integer.parseInt(numberStr); // Converts string to an integer
        System.out.println(number); // Outputs: 1234

        // Example 32: Convert Integer to String
        int num = 5678;
        String numStr1 = Integer.toString(num); // Converts integer to string
        System.out.println(numStr1); // Outputs: "5678"

        // Example 33: Joining strings with delimiter
        String[] words = {"Java", "is", "fun"};
        String sentence = String.join(" ", words); // Joins words array into a sentence with spaces
        System.out.println(sentence); // Outputs: Java is fun

        // Example 34: Comparing strings lexicographically
        String first = "apple";
        String second = "banana";
        int result = first.compareTo(second); // Compares two strings lexicographically
        System.out.println(result); // Outputs a negative number because apple is before banana

        // Example 35: Check if string contains only digits
        String digits = "123456";
        boolean onlyDigits = digits.matches("\\d+"); // Checks if the string contains only digits
        System.out.println(onlyDigits); // Outputs: true

        // Example 36: Count occurrences of a character in a string
        String countChars = "banana";
        long count = countChars.chars().filter(ch -> ch == 'a').count(); // Counts 'a' in the string
        System.out.println(count); // Outputs: 3

        // Example 37: Removing a character from a string
        String removeChar = "banana";
        String removed = removeChar.replace("a", ""); // Removes all 'a's from the string
        System.out.println(removed); // Outputs: bnn

        // Example 38: Reverse words in a sentence
        String sentenceToReverse = "Java is fun";
        String reversedWords = new StringBuilder(sentenceToReverse).reverse().toString(); // Reverses the entire sentence
        System.out.println(reversedWords); // Outputs: nuf si avaJ

        // Example 39: Checking for a palindrome
        String palindrome = "madam";
        String revPalindrome = new StringBuilder(palindrome).reverse().toString(); // Reverses the string
        System.out.println(palindrome.equals(revPalindrome)); // Outputs: true

        // Example 40: Formatting strings
        double price = 24.99;
        String formatted = String.format("The price is $%.2f", price); // Formats the price to 2 decimal places
        System.out.println(formatted); // Outputs: The price is $24.99

        // Example 41: Converting a string to a stream of characters
        String streamString = "example";
        streamString.chars() // Creates an IntStream
                .mapToObj(c -> (char) c) // Converts int to char
                .forEach(System.out::print); // Prints each character
        System.out.println();



        // Example 43: Extract digits from a string
        String alphaNumeric = "ab12cd34";
        String digitsOnly = alphaNumeric.replaceAll("[^0-9]", ""); // Removes non-digits
        System.out.println(digitsOnly); // Outputs: 1234



        // Example 45: Create a substring without causing exceptions
        String safeSubstring = "short";
        String safeSub = safeSubstring.substring(0, Math.min(10, safeSubstring.length())); // Safely creates a substring
        System.out.println(safeSub); // Outputs: short

    }
}
