package Palindrome;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the word to check for Palindrome >> ");
        Scanner keyboard = new Scanner(System.in);
        String theWord = keyboard.nextLine();
        boolean result;
        System.out.println();
        result = checkMethod(theWord);
        System.out.println(result);
    }

    public static boolean checkMethod(String word) {
        String reverse = reverse(word);
        if (word.equals(reverse)) {
            return true;
        } else return false;
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }
}