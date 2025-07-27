package org.rahmasir;

import org.rahmasir.PalindromeChecker;

public class App {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        String testString1 = "level";
        String testString2 = "world";
        String testString3 = "evilolive";

        System.out.println("Is '" + testString1 + "' a palindrome? " + checker.isPalindrome(testString1));
        System.out.println("Is '" + testString2 + "' a palindrome? " + checker.isPalindrome(testString2));
        System.out.println("Is '" + testString3 + "' a palindrome? " + checker.isPalindrome(testString3));
    }
}