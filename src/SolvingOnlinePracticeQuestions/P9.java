package SolvingOnlinePracticeQuestions;

public class P9 {
    public static void main(String[] args) {
        /*
        Print the ASCII value of the character 'h'.
        American Standard Code for Information Interchange.
         */
        int a='h';
        System.out.println("ASCII of h = "+a);
        System.out.println("-------");
        //Second way
        System.out.println((int)'h');

        System.out.println("---------");
        // Third way

        char what='H';  // Capital and Lower case will have different values
        int hi=(int) what;
        System.out.println(hi);

        System.out.println("----------");

        //Same way as third way just the sout different
        //characters whose ASCII value to be found
        char ch1 = 'h';
        //casting or converting a charter into int type
        int ascii1 = (int) ch1;

        System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);

    }
}
