/*
1. Array Statistics
• Description: Write a program that takes an array of integers as input and calculates:
o The sum of all elements.
o The average of the elements.
o The smallest and largest elements.
• Challenge Ideas: Extend the program to find the second smallest and second largest
elements.

2. Palindrome Checker
• Description: Write a program to check if a word or a number is a palindrome.
• Key Concepts: Loops, string manipulation, conditional statements.
• Challenge Ideas: Extend to check if a sentence is a palindrome, ignoring spaces and
punctuation.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        int sum = 0;
        double average;
        int min = numbers[0];
        int max = numbers[0];

        for (int num: numbers){
            sum += num;
        }
        for (int num: numbers){
            if (num < min){
                min = num;
            }
        }
        for (int num: numbers){
            if (num > max){
                max = num;
            }
        }
        average = (double) sum / numbers.length;

        System.out.println("sum = "+sum);
        System.out.println("average = "+average);
        System.out.println("min = "+min);
        System.out.println("max = "+max);

        Arrays.sort(numbers);
        if (numbers.length >= 2){
            int min1 = numbers[1];
            int max1 = numbers[numbers.length - 2];

            System.out.println("Второй по величине элемент: " + min1);
            System.out.println("Второй по убыванию элемент: " + max1);

        }
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите слово или число для проверки на палиндром: ");
        String input = scan.nextLine();

        if  (isPalindrom(input)) {
            System.out.println("It is palindrom");
        } else{
            System.out.println("Not palindrom");
        }

        
    }
    public static boolean isPalindrom(String str) {
        String lowerCaseStr = str.toLowerCase();
        String cleaned = lowerCaseStr.replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
