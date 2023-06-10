package SolvingOnlinePracticeQuestions;

public class P2 {
    public static void main(String[] args) {
        /*

Write a program to print
*
**
***
****
on screen.
         */
        // Preferred way
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second way
        System.out.println();
        System.out.println("*\n**\n***\n****");
    }
}
