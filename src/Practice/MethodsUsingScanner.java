package Practice;

import java.util.Scanner;

public class MethodsUsingScanner {
 /*
    create a method, call it contains. It should take an array of int and an int number
    in the method body. It should search the array for that number.
    If number is present in the array method should return true otherwise method
    should return false. In a separate class call the method and test it for below input.
    {10,20,45} number 20
     */
    boolean contains(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        for (int num : arr) {
            if (search==num){
                return true;
            }
        }
        return false;
    }
}

