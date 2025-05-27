			ARRAY PROGRAMS
//Q.1 Write a program to find the largest element in an array.

  public class LargestElementFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 5, 90, 34};

        int largest = numbers[0]; 

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; 
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}

// Q. 2 Write a program to calculate the sum of all elements in an array.

  public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}

// Q. 3 Write a program to reverse an array.

   public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
	
// Q. 4 Write a program to find the smallest element in an array.

   public class SmallestElementFinder {
    public static void main(String[] args) {
        int[] numbers = {25, 11, 7, 75, 56};

        int smallest = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; 
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}

// Q. 5 Write a program to count even and odd numbers in an array.

    public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 4, 45, 66, 93, 1};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}

// Q. 6 Write a program to copy one array to another.

   public class ArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Copied array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}

// Q. 7 Write a program to sort an array in ascending order.

  public class ArraySortAscending {
    public static void main(String[] args) {
        int[] numbers = {29, 10, 14, 37, 13};

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

// Q. 8 Write a program to search for an element in an array.

    import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 34, 7, 19, 26, 3};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found at index " + position + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

// Q.9 Write a program to merge two arrays.

   public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60, 70};

        int length1 = array1.length;
        int length2 = array2.length;

        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
} 

// Q. 10 Write a program to remove duplicate elements from an array.

   import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 2, 4, 3, 2, 1, 5, 7, 3};

        Arrays.sort(numbers);

        int[] temp = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[numbers.length - 1];

        int[] unique = new int[j];
        for (int i = 0; i < j; i++) {
            unique[i] = temp[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}

				STRING QUESTIONS 
Q1. Write a program to find the length of a string.

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}

Q2. Write a program to count the number of vowels and consonants in a string.

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}

Q3. Write a program to reverse a string.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}

Q4.. Write a program to check if a string is a palindrome.

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}

Q5.Write a program to convert lowercase letters to uppercase in a string.

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String upperCaseString = input.toUpperCase();

        System.out.println("Uppercase string: " + upperCaseString);

        scanner.close();
    }
}

Q6.Write a program to count the frequency of characters in a string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            // Optional: ignore spaces
            if (ch == ' ') continue;

            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        scanner.close();
    }
}

Q7.Write a program to remove all white spaces from a string.

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String noSpaces = input.replaceAll("\\s+", "");

        System.out.println("String without white spaces: " + noSpaces);

        scanner.close();
    }
}

Q8.Write a program to compare two strings.

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}

Q9. Write a program to find the first non-repeated character in a string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeated character found.");
        }

        scanner.close();
    }
}

Q10.Write a program to replace all occurrences of a character in a string.

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        String result = input.replace(oldChar, newChar);

        System.out.println("Updated string: " + result);

        scanner.close();
    }
}