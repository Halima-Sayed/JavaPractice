package Replit;

import java.util.LinkedList;
import java.util.List;

public class R192 {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new LinkedList<>();

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        System.out.println(primeNumbers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
       /* for (int i = 2; i <= Math.sqrt(number); i++) { //<- learn Math.sqrt
            if (number % i == 0) {
                return false;

        */

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;


            }
        }

        return true;
    }
}
