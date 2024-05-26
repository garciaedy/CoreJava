package Promts;

public class ChallengesPrt2 {

    public static void main(String[] args){
        /*-----------------------------------------------------------------
Challenge: 00-sayHello (example)
Difficulty: Basic
Prompt:
Write a method called sayHello that returns the string "Hello!".
Examples:
sayHello() //=> Hello!
-----------------------------------------------------------------*/
// Your solution for 00-sayHello (example) here:

/*-----------------------------------------------------------------
Challenge: 01-addOne
Difficulty: Basic
Prompt:
Write a method called addOne that takes a single integer as an argument and returns that integer plus 1.
Examples:
addOne(1) //=> 2
addOne(-5) //=> -4
-----------------------------------------------------------------*/
// Your solution for 01-addOne here:

/*-----------------------------------------------------------------
Challenge: 02-addTwoNumbers
Difficulty: Basic
Prompt:
Write a method called addTwoNumbers that accepts two numeric arguments and returns the sum of those two numbers.
If either argument is not a Number, return the value of NaN.
Examples:
addTwoNumbers(5, 10) //=> 15
addTwoNumbers(10, -2) //=> 8
addTwoNumbers(0, 0) //=> 0
addTwoNumbers("Hello", 5) //=> NaN
-----------------------------------------------------------------*/
// Your solution for 02-addTwoNumbers here:

/*-----------------------------------------------------------------
Challenge: 03-sumNumbers
Difficulty: Basic
Prompt:
- Write a method called sumNumbers that accepts a single array of integers and returns the sum of the integers in the array.
- If the array is empty, return 0 (zero).
Examples:
sumNumbers(new int[]{10}) //=> 10
sumNumbers(new int[]{5, 10}) //=> 15
sumNumbers(new int[]{2, 10, -5}) //=> 7
sumNumbers(new int[]{}) //=> 0
-----------------------------------------------------------------*/
// Your solution for 03-sumNumbers here:

/*-----------------------------------------------------------------
Challenge: 04-addList
Difficulty: Basic
Prompt:
- Write a method called addList that accepts any quantity of numbers as arguments, adds them together and returns the resulting sum.
- Assume all parameters will be numbers.
- If called with no arguments, return 0 (zero).
Examples:
addList(1) //=> 1
addList(1, 50, 1.23) //=> 52.23
addList(7, -12) //=> -5
-----------------------------------------------------------------*/
// Your solution for 04-addList here:

/*-----------------------------------------------------------------
Challenge: 05-computeRemainder
Difficulty: Basic
Prompt:
- Write a method named computeRemainder that accepts two numeric arguments and returns the remainder of the division of those two numbers.
- The first argument should be the dividend and the second argument should be the divisor.
- If a 0 is passed in as the second argument you should return Java's special numeric value: Infinity.
- For extra fun, complete this challenge without using the modulus (%) operator.
Examples:
computeRemainder(10, 2) //=> 0
computeRemainder(4, 0) //=> Infinity
computeRemainder(10.5, 3) //=> 1.5
-----------------------------------------------------------------*/
// Your solution for 05-computeRemainder here:

/*-----------------------------------------------------------------
Challenge: 06-range
Difficulty: Basic
Prompt:
- Write a method called range that accepts two integers as arguments and returns an array of integers starting with the first argument up to one less than the second argument.
- The range method must be called with the first argument less than or equal to the second argument, otherwise return the string "First argument must be less than second".
Examples:
range(1, 4) //=> [1, 2, 3]
range(-2, 3) //=> [-2, -1, 0, 1, 2]
range(1, 1) //=> []
range(5, 2) //=> "First argument must be less than second"
-----------------------------------------------------------------*/
// Your solution for 06-range here:

/*-----------------------------------------------------------------
Challenge: 07-reverseUpcaseString
Difficulty: Basic
Prompt:
- Write a method called reverseUpcaseString that accepts a single string argument, then returns the string with its characters in reverse order and converts all characters to uppercase.
Examples:
reverseUpcaseString("SEI Rocks!") //=> "!SKCOR IES"
-----------------------------------------------------------------*/
// Your solution for 07-reverseUpcaseString here:

/*-----------------------------------------------------------------
Challenge: 08-removeEnds
Difficulty: Basic
Prompt:
- Write a method called removeEnds that accepts a single string argument, then returns a string with the first and last characters removed.
- If the length of the string argument is less than 3, return an empty string.
Examples:
removeEnds("SEI Rocks!") //=> "EI Rocks"
removeEnds("a") //=> "" (empty string)
-----------------------------------------------------------------*/
// Your solution for 08-removeEnds here:

/*-----------------------------------------------------------------
Challenge: 09-charCount
Difficulty: Basic
Prompt:
- Write a method named charCount that accepts a single string argument
- and returns a HashMap that represents the count of each character in the string.
- The returned HashMap should have keys that represent the character with its value
- set to the how many times the character appears in the string argument.
- Upper and lower case characters should be counted separately.
- Space characters should be counted too.
Examples:
charCount("hello") //=> {h=1, e=1, l=2, o=1}
charCount("Today is fantastic!") //=> {T=1, o=1, d=1, a=3, y=1, =2, i=2, s=2, f=1, n=1, t=2, c=1, !=1}
-----------------------------------------------------------------*/
// Your solution for 09-charCount here:

/*-----------------------------------------------------------------
Challenge: 10-formatWithPadding
Difficulty: Basic
Prompt:
- Write a method called formatWithPadding that accepts three arguments:
  - An integer representing the number to format.
  - A string argument (a single character) representing the character used to "pad" the returned string to a minimum length.
  - Another integer representing the length to "pad" the returned string to.
- The method should return the integer as a string, "left padded" to the length of the 3rd arg using the character provided in the 2nd arg.
- If the length of the integer converted to a string is equal or greater than the 3rd argument, no padding is needed - just return the integer as a string.
Examples:
formatWithPadding(123, "0", 5) //=> "00123"
formatWithPadding(42, "*", 10) //=> "********42"
formatWithPadding(1234, "*", 3) //=> "1234"
-----------------------------------------------------------------*/
// Your solution for 10-formatWithPadding here:

/*-----------------------------------------------------------------
Challenge: 11-isPalindrome
Difficulty: Intermediate
Prompt:
- Write a method called isPalindrome that accepts a single string argument, then returns true or false depending upon whether or not the string is a palindrome.
- A palindrome is a word or phrase that is the same forward or backward.
- Casing and spaces are not included when considering whether or not a string is a palindrome.
- If the length of the string is 0 or 1, return true.
Examples:
isPalindrome("SEI Rocks") //=> false
isPalindrome("rotor") //=> true
isPalindrome("A nut for a jar of tuna") //=> true
isPalindrome("") //=> true
-----------------------------------------------------------------*/
// Your solution for 11-isPalindrome here:

/*-----------------------------------------------------------------
Challenge: 12-hammingDistance
Difficulty: Intermediate
Prompt:
In information theory, the hamming distance refers to the count of the differences between two strings of equal length. It is used in computer science for such things as implementing "fuzzy search" capability.
- Write a method named hammingDistance that accepts two arguments which are both strings of equal length.
- The method should return the count of the symbols (characters, numbers, etc.) at the same position within each string that are different.
- If the strings are not of the same length, the method should return NaN.
Examples:
hammingDistance("abc", "abc") //=> 0
hammingDistance("a1c", "a2c") //=> 1
hammingDistance("!!!!", "****") //=> 4
hammingDistance("abc", "ab") //=> NaN
-----------------------------------------------------------------*/
// Your solution for 12-hammingDistance here:

/*-----------------------------------------------------------------
Challenge: 13-mumble
Difficulty: Intermediate
Prompt:
- Write a method called mumble that accepts a single string argument.
- The method should return a string that has each character repeated the number of times according to its position within the string argument. In addition, each repeated section of characters should be separated by a hyphen (-).
- Examples describe it best..
Examples:
mumble("X") //=> "X"
mumble("abc") //=> "a-bb-ccc"
mumble("121") //=> "1-22-111"
mumble("!A 2") //=> "!-AA-   -2222"
-----------------------------------------------------------------*/
// Your solution for 13-mumble here:

/*-----------------------------------------------------------------
Challenge: 14-fromPairs
Difficulty: Intermediate
Prompt:
- Write a method named fromPairs that creates a HashMap from an array containing nested arrays.
- Each nested array will have two elements representing key/value pairs used to create key/value pairs in a HashMap to be returned by the method.
- If a key appears in multiple pairs, the rightmost pair should overwrite the previous entry in the HashMap.
Examples:
fromPairs(new Object[][] { {"a", 1}, {"b", 2}, {"c", 3} }) //=> {a=1, b=2, c=3}
fromPairs(new Object[][] { {"name", "Sam"}, {"age", 24}, {"name", "Sally"} }) //=> {name=Sally, age=24}
-----------------------------------------------------------------*/
// Your solution for 14-fromPairs here:

/*-----------------------------------------------------------------
Challenge: 15-mergeObjects
Difficulty: Intermediate
Prompt:
- Write a method named mergeObjects that accepts at least two HashMaps as arguments, merges the properties of the second through n HashMaps into the first HashMap, then finally returns the first HashMap.
- If any HashMaps have the same property key, values from the HashMap(s) later in the arguments list should overwrite earlier values.
Examples:
mergeObjects(new HashMap<>(), new HashMap<>(Map.of("a", 1))) //=> {a=1}
mergeObjects(new HashMap<>(Map.of("a", 1, "b", 2, "c", 3)), new HashMap<>(Map.of("d", 4))) //=> {a=1, b=2, c=3, d=4}
mergeObjects(new HashMap<>(Map.of("a", 1, "b", 2, "c", 3)), new HashMap<>(Map.of("d", 4)), new HashMap<>(Map.of("b", 22, "d", 44))) //=> {a=1, b=22, c=3, d=44}
-----------------------------------------------------------------*/
// Your solution for 15-mergeObjects here:

/*-----------------------------------------------------------------
Challenge: 16-findHighestPriced
Difficulty: Intermediate
Prompt:
- Write a method named findHighestPriced that accepts a single array of objects.
- The objects contained in the array are guaranteed to have a price property holding a numeric value.
- The method should return the object in the array that has the largest value held in the price property.
- If there's a tie between two or more objects, return the first of those objects in the array.
- Return the original object, not a copy.
- Do not mutate the array being passed in.
Examples:
findHighestPriced(new Item[] {
  new Item("a1", 25),
  new Item("b2", 5),
  new Item("c3", 50),
  new Item("d4", 10)
}); //=> new Item("c3", 50)
findHighestPriced(new Item[] {
  new Item("a1", 25),
  new Item("b2", 50),
  new Item("c3", 50),
  new Item("d4", 10)
}); //=> new Item("b2", 50)
-----------------------------------------------------------------*/
// Your solution for 16-findHighestPriced here:

/*-----------------------------------------------------------------
Challenge: 17-mapArray
Difficulty: Intermediate
Prompt:
The goal is of this challenge is to write a method that performs the functionality of JavaScript's Array.prototype.map method.
- Write a method named mapArray that accepts two arguments: a single array and a callback function.
- The mapArray method should return a new array of the same length as the array argument.
- The mapArray method should iterate over each element in the array (first arg). For each iteration, invoke the callback function (2nd arg), passing to it as arguments, the current element and its index. Whatever is returned by the callback function should be included in the new array at the index of the current iteration.
Examples:
mapArray(new int[] {1, 2, 3}, (n) -> n * 2); //=> [2, 4, 6] (a new array)
mapArray(new String[] {"rose", "tulip", "daisy"}, (f, i) -> (i + 1) + " - " + f); //=> ["1 - rose", "2 - tulip", "3 - daisy"]
-----------------------------------------------------------------*/
// Your solution for 17-mapArray here:

/*-----------------------------------------------------------------
Challenge: 18-reduceArray
Difficulty: Intermediate
Prompt:
The goal is of this challenge is to write a method that performs the functionality of JavaScript's Array.prototype.reduce method.
- Write a method named reduceArray that accepts three arguments: (1) an array; (2) a callback function; and (3) a value used as the initial value of the "accumulator".
- The reduceArray method should return whatever is returned by the callback function on the last iteration.
- The reduceArray method should iterate over each element in the array (first arg). For each iteration, invoke the callback function (2nd arg), passing to it three arguments: (1) the "accumulator", which is the value returned by the callback during the previous iteration; (2) the current element; and (3) the index of the current iteration.
- On the first iteration, provide the third argument provided to reduceArray as the first argument when invoking the callback, then for subsequent iterations, provide the value returned by the callback during the previous iteration.
Examples:
reduceArray(new int[] {1, 2, 3}, (acc, n) -> acc + n, 0); //=> 6
reduceArray(new int[] {1, 2, 3}, (acc, n, i) -> acc + n + i, 0); //=> 9
reduceArray(new String[] {"Yes", "No", "Yes", "Maybe"}, (acc, v) -> { acc.put(v, acc.getOrDefault(v, 0) + 1); return acc; }, new HashMap<>()); //=> {Yes=2, No=1, Maybe=1}
-----------------------------------------------------------------*/
// Your solution for 18-reduceArray here:

/*-----------------------------------------------------------------
Challenge: 19-flatten
Difficulty: Intermediate
Prompt:
- Write a method named flatten that accepts a single array that may contain nested arrays and returns a new "flattened" array.
- A flattened array is an array that contains no nested arrays.
- Arrays maybe nested at any level.
- If any of the arrays have duplicate values those duplicate values should be present in the returned array.
- The values in the new array should maintain their ordering as shown in the examples below.
Hint:
- This assignment provides an excellent opportunity to use recursion (a method that calls itself). It can also be solved by using an inner method.
Examples:
flatten(new Object[] {1, new Object[] {2, 3}}); //=> [1, 2, 3] (a new array)
flatten(new Object[] {1, new Object[] {2, new Object[] {3, new Object[] {4}}}, 1, "a", new Object[] {"b", "c"}}); //=> [1, 2, 3, 4, 1, "a", "b", "c"]
-----------------------------------------------------------------*/
// Your solution for 19-flatten here:

/*-----------------------------------------------------------------
Challenge: 20-isPrime
Difficulty: Intermediate
Prompt:
- Write a method named isPrime that returns true when the integer argument passed to it is a prime number and false when the argument passed to it is not prime.
- A prime number is a whole number (integer) greater than 1 that is evenly divisible by only itself.
Examples:
isPrime(2) //=> true
isPrime(3) //=> true
isPrime(4) //=> false
isPrime(29) //=> true
isPrime(200) //=> false
-----------------------------------------------------------------*/
// Your solution for 20-isPrime here:

/*-----------------------------------------------------------------
Challenge: 21-primeFactors
Difficulty: Intermediate
Prompt:
Now that you have solved the last challenge of determining if a whole number is prime, let's expand upon that concept to...
- Write a method named primeFactors that accepts a whole number greater than one (1) as an argument and returns an array of that argument's prime factors.
- The prime factors of a whole number are the prime numbers that, when multiplied together, equals the whole number.
- If the argument provided is not greater than 1, or not a whole number, then primeFactors should return an empty array.
Examples:
primeFactors(2) //=> [2]
primeFactors(3) //=> [3]
primeFactors(4) //=> [2, 2]
primeFactors(18) //=> [2, 3, 3]
primeFactors(29) //=> [29]
primeFactors(105) //=> [3, 5, 7]
primeFactors(200) //=> [2, 2, 2, 5, 5]
-----------------------------------------------------------------*/
// Your solution for 21-primeFactors here:

/*-----------------------------------------------------------------
Challenge: 22-intersection
Difficulty: Intermediate
Prompt:
- Write a method named intersection that accepts two arguments which are both arrays. The array arguments may contain any mixture of strings, numbers and/or booleans - but no reference types, i.e., objects.
- The method should return a new array containing all elements in common, including repeating element values.
- The ordering of the elements in the returned array is not important.
- If there are no elements in the arrays in common, the intersection method should return an empty array.
- The method should not mutate (change) either argument.
Examples:
intersection(new Object[] {"a", 1}, new Object[] {}) //=> []
intersection(new Object[] {"a", 1}, new Object[] {true, "a", 15}) //=> ["a"]
intersection(new Object[] {1, "a", true, 1, 1}, new Object[] {true, 1, "b", 1}) //=> [1, true, 1]
-----------------------------------------------------------------*/
// Your solution for 22-intersection here:

/*-----------------------------------------------------------------
Challenge: 23-balancedBrackets
Difficulty: Intermediate
Prompt:
- Write a method called balancedBrackets that accepts a single string as argument.
- The input string is composed entirely of parentheses, brackets and/or curly braces, i.e., (), [] and/or {}. Referred to as "braces" from this point forward...
- The balancedBraces method should return true if the string's braces are "balanced" and false if they are not.
- The brackets are considered unbalanced if any closing bracket does not close the same type of opening bracket, ignoring already matched brackets between them. Examples explain it best...
Examples:
balancedBrackets("()") // => true
balancedBrackets("(]") // => false
balancedBrackets("[{}]") // => true
balancedBrackets("[(])") // => false
balancedBrackets("[({}[])]") // => true
-----------------------------------------------------------------*/
// Your solution for 23-balancedBrackets here:

/*-----------------------------------------------------------------
Challenge: 24-isWinningTicket
Difficulty: Intermediate
Prompt:
- Write a method called isWinningTicket that accepts a single array as argument.
- The input array represents a 'lottery ticket' consisting of one or more nested 2-value arrays. The first value of a nested array will be a string, the second an integer.
- The isWinningTicket method should return true if all of the nested arrays have a character in the string whose numeric character code equals the integer (2nd value).
- If any of the nested arrays have a string where all of the character's character code does not match the integer, then return false.
Hints:
- A character/string can be created from a character code using the String.fromCharCode() class method.
- A character within a string's character code can be obtained using the charCodeAt() string method.
Examples:
isWinningTicket(new Object[][] { {"ABC", 65} }) // => true
isWinningTicket(new Object[][] { {"ABC", 999}, {"XY", 89} }) // => false
isWinningTicket(new Object[][] { {"ABC", 66}, {"dddd", 100}, {"Hello", 108} }) // => true
isWinningTicket(new Object[][] { {"ABC", 66}, {"dddd", 15}, {"Hello", 108} }) // => false
-----------------------------------------------------------------*/
// Your solution for 24-isWinningTicket here:

/*-----------------------------------------------------------------
Challenge: 25-getNumForIP
Difficulty: Intermediate
Prompt:
- Write a method called getNumForIP that accepts a single string as argument.
- The input string is formatted as an IP address, such as "192.156.99.15". IP addresses are used in networking and are actually 32-bit integers. However, those that work with networks find it more convenient to work with these numbers as four 8-bit integers, separated by a 'dot' character.
- The getNumForIP method should return the numeric value of the string IP address being passed in as an argument.
Hints:
- Each 8-bit number can hold a value between 0 and 256.
- An IP's right most 8-bit number represents how many of 256 raised to the power of 0 (equals 1) there are. The next 8-bit number represents how many of 256 raised to the power of 1 (256) there are, etc. For example, if you took the right-most two 8-bit numbers of the IP address 192.156.99.15, you would have 15 * (256 ** 0), which equals 15, and 99 * (256 ** 1), which equals 25344.
- To compute the numeric value for an IP address, you first compute the value for each of the four 8-bit chunks (as described in the above hint), and add them together!
Examples:
getNumForIP("0.0.0.1") // => 1
getNumForIP("0.0.2.0") // => 512
getNumForIP("192.156.99.15") // => 3231474447
getNumForIP("10.0.0.1") // => 167772161
-----------------------------------------------------------------*/
// Your solution for 25-getNumForIP here:

/*-----------------------------------------------------------------
Challenge: 26-toCamelCase
Difficulty: Intermediate
Prompt:
- Write a method called toCamelCase that accepts a single string as argument.
- The toCamelCase method should return the string as camel-cased, removing each _ or - characters and capitalizing the character following the _ or -.
- If the string argument does not contain a "_" or a "-", return the same string.
Hints:
- This is a great challenge for using regular expressions combined with the String.replace method.
Examples:
toCamelCase("sei") // => "sei"
toCamelCase("sei-rocks") // => "seiRocks"
toCamelCase("banana_Turkey_potato") // => "bananaTurkeyPotato"
toCamelCase("Mama-mia") // => "MamaMia"
toCamelCase("A_b_c") // => "ABC"
-----------------------------------------------------------------*/
// Your solution for 26-toCamelCase here:

/*-----------------------------------------------------------------
Challenge: 27-countTheBits
Difficulty: Intermediate
Prompt:
- Write a method called countTheBits that accepts a single numeric argument that will be an integer.
- The method should return the number of bits that are set to 1 in the number's binary representation.
Hints:
- We typically work with "decimal" numbers on a daily basis. Decimal is "base 10", where there are 10 digits available - 0 thru 9. However, it's binary that computers understand - 1's and 0's. The 1's and 0's are called bits.
- As an example, the decimal value of 13 is represented in binary as 1101. There are 3 one bits and 1 zero bit in the decimal number of 13.
- Carefully read the documentation for the Integer.toBinaryString method.
Examples:
countTheBits(0) // => 0
countTheBits(13) // => 3
countTheBits(256) // => 1
countTheBits(255) //=> 8
countTheBits(65535) //=> 16
-----------------------------------------------------------------*/
// Your solution for 27-countTheBits here:

/*-----------------------------------------------------------------
Challenge: 28-gridTrip
Difficulty: Intermediate
Prompt:
- This challenge uses an imaginary grid where the x coordinate increases when you move 'up' and decreases when you move 'down'. Similarly, the y coordinate increases when you move 'right' and decreases when you move 'left'.
- Write a method called gridTrip that accepts two arguments.
- The first argument is an array containing two integers. The first represents the starting x position on the grid. The second integer in the array represents the starting y position.
- The second argument is a string representing "moves" using the characters 'U', 'D', 'R' & 'L' to represent moving Up, Down, Right & Left respectively. Each direction character will be followed by digits representing how many units to move in that direction. For example, a string of 'D15R2U4' represents moving down 15 units, to the right 2 units, and finally, up 4 units. The direction characters will always be upper case.
- The gridTrip method should return a new array of two integers: the final x position and the final y position. Do not modify the array argument).
Hint:
- Using the String.split method to break the string into parts can be helpful if you want to break the single string of moves into an array of distinct moves by direction. Be sure to use the regular expression to match both the direction character and the digits.
Examples:
gridTrip(new int[] {0, 0}, "U2R1") // => [2, 1]
gridTrip(new int[] {5, 10}, "D5L15U2") //-> [2, -5]
gridTrip(new int[] {-22, 100}, "L2L15D50U1D9") //=> [-80, 83]
-----------------------------------------------------------------*/
// Your solution for 28-gridTrip here:

/*-----------------------------------------------------------------
Challenge: 29-addChecker
Difficulty: Intermediate
Prompt:
- Write a method called addChecker that accepts two arguments.
- The first argument is an array containing at least two integers. The integers in the array are sorted in ascending order.
- The second argument is an integer.
- The addChecker method should return true if there are two integers in the array of integers (first argument) that when added together, equals the integer passed in as the second argument.
- If there are no two integers in the array that sum up to equal the second argument, addChecker should return false.
Hint:
- An efficient solution can leverage the fact that the integers in the array are sorted.
Examples:
addChecker(new int[] {1, 2}, 3) // => true
addChecker(new int[] {-3, 2}, 9) // => false
addChecker(new int[] {10, 15, 16, 22}, 32) // => true
addChecker(new int[] {10, 15, 16, 22}, 19) // => false
-----------------------------------------------------------------*/
// Your solution for 29-addChecker here:

/*-----------------------------------------------------------------
Challenge: 30-totalTaskTime
Difficulty: Difficult
Prompt:
- Write a method called totalTaskTime that accepts two arguments.
- The first argument is an array of integers referred to as a "queue". Each integer in the queue represents a "task", more specifically, the amount of time to complete that task.
- The second argument is an integer representing the number of CPU "threads" available to process all of the tasks in the queue.
- The totalTaskTime method should return an integer representing the total time it is going to take to complete all of the tasks in the queue.
- You may mutate the "queue" array (first argument) if you wish.
Hint:
- Solve it with paper and pencil first. Look for patterns and generalize. Pseudocode!
Examples:
totalTaskTime(new int[] {}, 1) // => 0
totalTaskTime(new int[] {4, 2, 5}, 1) // => 11
totalTaskTime(new int[] {5, 8}, 2) // => 8
totalTaskTime(new int[] {4, 2, 10}, 2) // => 12
totalTaskTime(new int[] {2, 2, 3, 3, 4, 4}, 2) //=> 9
totalTaskTime(new int[] {5, 2, 6, 8, 7, 2}, 3) // => 12
-----------------------------------------------------------------*/
// Your solution for 30-totalTaskTime here:


    }
}
