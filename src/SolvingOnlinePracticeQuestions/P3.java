package SolvingOnlinePracticeQuestions;

public class P3 {
    public static void main(String[] args) {
        /*
        Print the following pattern on the screen
*****
 *** 
  *  
 *** 
*****
         */
        // How to remove spaces?
        for (int i = 5; i >= 0; i--) {
            if (i != 4 && i != 2)
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
        for (int i = 3; i <= 5; i++) {
            if (i != 4)
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
