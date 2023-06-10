package SolvingOnlinePracticeQuestions;

public class P18 {
    public static void main(String[] args) {
        /*
        Write a program to add 8 to the number 2345 and then divide it by 3.
         Now, the modulus of the quotient is taken with 5
         and then multiply the resultant value by 5. Display the final result.
         */
        int num=2345;
        int sum=num+8;
        int result=sum/3;
        int a=result%5;
        int b=a*5;
        System.out.println(b);
    }
}
