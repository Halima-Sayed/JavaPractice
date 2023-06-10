package Replit;

import java.util.Locale;
import java.util.Scanner;

public class R99 {
    public static void main(String[] args) {
        /*Write code that will take in a String input and check to see if it is a palindrome or not.
A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
Examples of palindromes:
- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star
Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
Your program will print out "true" if it's a palindrome and "false" if not.
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String str = inp.nextLine();
        //write your code below
        str = str.toLowerCase().replace(" ", "");
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
            //  System.out.println(str.charAt(i));
        }
        boolean isEqual = str.equalsIgnoreCase(reversed);
        System.out.println(isEqual);
    }
}