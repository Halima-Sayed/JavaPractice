package SolvingOnlinePracticeQuestions;

public class P20 {
    public static void main(String[] args) {
        /*
        Write a program to print the power of 7 raised to 5.
        7 is the base and 5 is exponent to Raise a number to a power we basically multiply
        the base as many times as the exponent is in this 5 so 7*7*7*7*7=?
         */
        int base = 7, exponent = 5;

        long result = 1;

        for (; exponent != 0; --exponent) {
            result *= base;
        }

        System.out.println("Answer = " + result);

        // second way

        double power= Math.pow(7,5); // To change it to a whole number instead of decimal just add (int) before Math,pow() and change data type to int
        System.out.println(power);

    }
}
