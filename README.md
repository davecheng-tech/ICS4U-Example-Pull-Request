# Grade 11 Java Review - Part 2

## Instructions
Program the solutions for the problems described below. Combine all of your solutions into a single [`Utility.java`](src/gr11review/part2/Utility.java) file located in `src/gr11review/part2` directory. 

You will be required to:

### 1. Code Solutions
* Work collaboratively in a group of 2 or 3 members.
* Each member should pick **one problem per category** below, for a total of **five (5) problem per person** to code:
    * Methods
    * File I/O
    * Arrays, 1-dimension, 1-loop
    * Arrays, 1-dimension, 2-loops
    * Arrays, 2-dimensions
* Do not duplicate a problem already in progress.
* Each member should work on their own **personal branch** of `main`, committing and pushing changes to their own branch.
* When solutions are completed (e.g. full documentation and testing methods), create a **Pull Request** from your development branch to merge the changes into a single [`Utility.java`](src/gr11review/part2/Utility.java) file.

### 2. Test Solutions
* Create a test class [`UtilityTest.java`](src/gr11review/part2/UtilityTest.java) in the `src/gr11review/part2` directory.
* Keeping in mind the nature of [black-box and white-box testing](NOTES.md#review-notes-testing), define methods to thoroughly test the functionality of solutions. 
* In addition to example inputs given below, you should address **edge cases** and **corner cases** specific to your code.
* Give your test methods [descriptive names](NOTES.md#naming-tests). 

### 3. Maintain the Codebase
* Assign one group member the reponsibility of maintaining the codebase. Or, alternatively, meet as a group to maintain the codebase together. 
* Attend to Pull Requests, merging production-ready changes to the `main` branch.
* Work together to ensure consistency of style across the codebase, especially with respect to *variable naming*, *comments*, and *test naming*. 

<br><br>


## Problem Sets: Methods

### Methods 1

A string is considered “xy-balanced” if every occurrence of the character `x` in the string has a corresponding `y` character that appears after it. In other words, for each `x`, there must be a `y` somewhere later in the string to “balance” it. Note that one `y` can balance multiple `x`s. Your task is to implement a method that checks if a given string is xy-balanced and returns `true` if it is, or `false` if it is not.

#### Method Signature
```java
public static boolean xyBalance(String str)
```

##### Examples
```java
xyBalance("aaxbby") → true   // All 'x's are followed by 'y's later in the string
xyBalance("aaxbb") → false   // There are 'x's without 'y's after them
xyBalance("yaaxbb") → false  // Same as above, 'x's are not followed by 'y's
```

<br><br>
### Methods 2
You are given a string, and your task is to return the sum of all the numbers that appear in the string, ignoring any non-digit characters. A number is defined as a sequence of one or more consecutive digit characters.

To achieve this, you can use:

- `Character.isDigit(char)` to check if a character is a digit (`0` to `9`).
- `Integer.parseInt(string)` to convert a string of digits into an integer.
    
#### Method Signature 
```java
public static int sumNumbers(String str)
```

#### Examples
```java
sumNumbers("abc123xyz") → 123  
// Explanation: The only number present in the string is "123", so the sum is 123.

sumNumbers("aa11b33") → 44  
// Explanation: There are two numbers in the string: "11" and "33". Their sum is 11 + 33 = 44.

sumNumbers("7 11") → 18  
// Explanation: The numbers present are "7" and "11". Their sum is 7 + 11 = 18.
```

<br><br>
### Methods 3
Given a string, does `xyz` appear in the middle of the string? To define middle, we'll say that the number of `chars` to the left and right of the `xyz` must differ by one, at most.

#### Method Signature 
```java
public static boolean xyzMiddle(String str)
```

#### Examples
```java
xyzMiddle("AAxyzBB") → true  
// Explanation: The substring "xyz" is in the middle. There are two characters ("AA") to the left and two characters ("BB") to the right of "xyz". 
// The number of characters to the left and right of "xyz" are equal, so the method returns true.

xyzMiddle("AxyzBB") → true  
// Explanation: The substring "xyz" is in the middle. There is one character ("A") to the left and two characters ("BB") to the right of "xyz". 
// The difference in the number of characters on either side of "xyz" is 1, which is within the allowed limit. Thus, the method returns true.

xyzMiddle("AxyzBBB") → false  
// Explanation: The substring "xyz" is not in the middle. There is one character ("A") to the left and three characters ("BBB") to the right of "xyz". 
// The difference in the number of characters on either side is 2, which exceeds the allowed limit. Thus, the method returns false.
```

<br><br>
## Problem Sets: File I/O

### File I/O 1
Write a method `longestWord` that reads a file containing one word per line and returns the longest word found in the file. The file will have multiple lines, and each line contains only a single word. 

#### Method Signature 
```java
public static String longestWord(String filenametxt) throws IOException
```

#### Example
The file [`words.txt`](src/gr11review/part2/words.txt) contains:  
```
lorem
ipsum
dolor
sit
amet
consectetur
adipiscing 
elit
```
Thus, the test case:
```java
longestWord("words.txt") → "consectetur"
// Explanation: The method reads each word from the file. The word "consectetur" has the most characters (11), which is longer than any other word in the file. Therefore, the method returns "consectetur".
```

<br><br>
### File I/O 2
 Write a method `alphaWord` that reads a file containing one word per line and returns the word that is alphabetically first in sequence.

#### Method Signature
```java
public static String alphaWord(String filenametxt) throws IOException
```

#### Example
The file [`words.txt`](src/gr11review/part2/words.txt) contains:  
```
lorem
ipsum
dolor
sit
amet
consectetur
adipiscing 
elit
```
Thus, the test case:
```java
alphaWord("words.txt") → "amet"
// Explanation: The method reads all the words from the file and compares them alphabetically. "amet" is the word that comes first alphabetically among all the words, so the method returns "amet".
```

<br><br>
### File I/O 3
Write a method `vowelCount` that reads a file containing one word per line and returns the word that has the highest number of vowels (`a`, `e`, `i`, `o`, `u`). If there is a tie (i.e. multiple words with the same number of vowels), return the first word that reaches the maximum vowel count.

#### Method Signature
```java
public static String vowelCount(String filenametxt) throws IOException
```

#### Example
The file [`words.txt`](src/gr11review/part2/words.txt) contains:  
```
lorem
ipsum
dolor
sit
amet
consectetur
adipiscing 
elit
```
Thus, the test case:
```java
vowelCount("words.txt") → "consectetur"
// Explanation: The method reads each word and counts the number of vowels (a, e, i, o, u) in each word. The word "consectetur" contains 4 vowels, which is the highest vowel count in the file. Therefore, the method returns "consectetur".
```


<br><br>
## Problem Sets: Arrays with 1-dimension, 1-loop

### Array 1
Given an array, return a version of the array where all instances of the number `10` are removed. The remaining elements should shift to the left, and the empty spaces at the end of the array should be filled with `0`s. You can modify and return the given array or create a new one.

#### Method Signature 
```java
public static int[] withoutTen(int[] nums)
```

#### Examples
```java
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
// Explanation: The two occurrences of 10 are removed, and the remaining numbers (1 and 2) shift to the left. The empty spaces are filled with 0s.

withoutTen([10, 2, 10]) → [2, 0, 0]
// Explanation: The occurrences of 10 are removed, and the number 2 shifts to the left. The empty spaces are filled with 0s.

withoutTen([1, 99, 10]) → [1, 99, 0]
// Explanation: The occurrence of 10 is removed, and the numbers 1 and 99 shift to the left. The empty space is filled with 0.
```

<br><br>
### Array 2
We define an element in an array as “alone” if it has different values immediately before and after it. Your task is to return a modified version of the array where any instance of the specified value that is “alone” is replaced by the larger of its neighboring values (either the one to the left or the one to the right).

#### Method Signature
```java
public static int[] notAlone(int[] nums, int value)
```

#### Examples
```java
notAlone([1, 2, 3], 2) → [1, 3, 3]
// Explanation: The number 2 is alone (it's between 1 and 3), so it's replaced by 3 (the larger of its neighbors).

notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
// Explanation: The first and second occurrences of 2 are alone and are replaced by the larger neighbor values (3 and 5, respectively). The last occurrence of 2 is not alone, so it remains unchanged.

notAlone([3, 4], 3) → [3, 4]
// Explanation: There are no "alone" elements because 3 does not have two neighbors. Therefore, the array remains the same.
```

<br><br>
### Array 3
Given an array, return a new array where all the zeros are moved to the front, while the order of the non-zero elements does not matter. For example, the array `{1, 0, 0, 1}` should become `{0, 0, 1, 1}`. You can either modify and return the original array or create a new one.

#### Method Signature
```java
public static int[] zeroFront(int[] nums)
```

#### Examples
```java
zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
// Explanation: All the zeros are moved to the front, and the remaining non-zero elements follow.

zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
// Explanation: The zeros are placed at the front, and the non-zero elements follow.

zeroFront([1, 0]) → [0, 1]
// Explanation: The single zero is placed at the front, and the non-zero element follows.
```

<br><br>
## Problem Sets: Arrays with 1-dimension, 2-loops

### Array 4
Given two sorted arrays of integers, `outer` and `inner`, return `true` if every number in the `inner` array also appears in the `outer` array. The best solution should make a single linear pass through both arrays by taking advantage of the fact that both arrays are already sorted in increasing order.

#### Method Signature
```java
public static boolean linearIn(int[] outer, int[] inner)
```

#### Examples
```java
linearIn([1, 2, 4, 6], [2, 4]) → true  
// Explanation: All numbers in `inner` (2, 4) are present in `outer`, so the method returns true.

linearIn([1, 2, 4, 6], [2, 3, 4]) → false  
// Explanation: The number 3 from `inner` is not present in `outer`, so the method returns false.

linearIn([1, 2, 4, 4, 6], [2, 4]) → true  
// Explanation: All numbers in `inner` (2, 4) are present in `outer`, so the method returns true.
```

<br><br>
### Array 5
Given a non-empty array of integers, return `true` if you can split the array into two parts such that the sum of the numbers in one part equals the sum of the numbers in the other part.

#### Method Signature
```java
public static boolean canBalance(int[] nums)
```

#### Examples
```java
canBalance([1, 1, 1, 2, 1]) → true  
// Explanation: The array can be split after the third element. The sum of the first three elements (1 + 1 + 1) equals the sum of the last two elements (2 + 1).

canBalance([2, 1, 1, 2, 1]) → false  
// Explanation: There is no way to split the array so that both parts have the same sum.

canBalance([10, 10]) → true  
// Explanation: The array can be split between the two elements. The sum of the first part (10) equals the sum of the second part (10).
```

<br><br>
### Array 6
Given a number `n >= 0`, create an array that contains a repeated sequence pattern: `{1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}` (spaces added to emphasize the grouping). The length of the resulting array is the sum of integers from `1` to `n` (i.e., `n*(n+1)/2`).


#### Method Signature  
```java
public static int[] seriesUp(int n)
```

#### Examples
```java
seriesUp(3) → [1, 1, 2, 1, 2, 3]  
// Explanation: The array follows the pattern of starting with 1, then adding increasing numbers until 3.

seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]  
// Explanation: The pattern now goes up to 4.

seriesUp(2) → [1, 1, 2]  
// Explanation: The pattern stops at 2.
```

<br><br>
## Problem Sets: Arrays with 2-dimensions

### Array 7
Write a method that reverses the contents of a 2D array. The last value in the original array should become the first, and the first value should become the last, while maintaining the original shape of the 2D array.

#### Method Signature
```java
public static int[][] reverse(int[][] arr)
```

#### Example
```java
reverse({{1,2,3},{4,5,6},{7,8,9}}) → {{9,8,7},{6,5,4},{3,2,1}}
// Explanation: All elements in the 2D array are reversed. The last element (9) becomes the first, and the first element (1) becomes the last.
```
Or, visualized in rows and columns:

```
[1,2,3]
[4,5,6]
[7,8,9]
```
returns

```
[9,8,7]
[6,5,4]
[3,2,1]
```


<br><br>
### Array 8
Write a method that returns a subarray from a given 2D array, including only the elements up to the specified row and column. The resulting array should include all rows and columns from the original array up to, but not exceeding, the given `row` and `col`.

#### Method Signature
```java
public static int[][] split(int[][] arr, int row, int col)
```

#### Example
```java
split({{1,2,3},{4,5,6},{7,8,9}}, 1, 1) → {{1,2},{4,5}}
// Explanation: The result includes all elements up to row 1 and column 1 of the original 2D array.
```
Or, visualized in rows and columns:

```
[1,2,3]
[4,5,6]
[7,8,9]
```
returns

```
[1,2]
[4,5]
```




<br><br>
### Array 9
Write a method that inverts a 2D array. Inverting means that each row of the original array becomes a column in the new array, and each column in the original array becomes a row.

Note, in linear algebra, this is known as a matrix transpose.

#### Method Signature
```java
public static int[][] invert(int[][] arr)
```

#### Example
```java
invert({{1,1,1},{2,2,2},{3,3,3}}) → {{1,2,3},{1,2,3},{1,2,3}}
// Explanation: Each row in the original array becomes a column in the new array, and vice versa.
```
Or, visualized in rows and columns:

```
[1,1,1]
[2,2,2]
[3,3,3]
```
returns

```
[1,2,3]
[1,2,3]
[1,2,3] 
```



<br><br>
