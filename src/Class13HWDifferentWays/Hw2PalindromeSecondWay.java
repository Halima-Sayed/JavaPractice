package Class13HWDifferentWays;

import java.util.Scanner;

public class Hw2PalindromeSecondWay {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("Please write the word:");
    String str= scan.next();
    String newString="";

    String palindrome=str;

        for (int i =str.length()-1; i >=0 ; i--) {
        newString=newString+str.charAt(i);
    }
         if(palindrome.equalsIgnoreCase(newString)){
        System.out.println("Word is Palindrome");
    }else {
        System.out.println("Word is not Palindrome");
    }
}
}

