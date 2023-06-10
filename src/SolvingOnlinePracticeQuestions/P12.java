package SolvingOnlinePracticeQuestions;

public class P12 {
    public static void main(String[] args) {
        /*
        Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
         */
        char character='d';
        int value=(int) character;
        System.out.println(value+3);

        System.out.println("--------");

        //Second way
        int what=3+'d';
        System.out.println(what);
    }
}
