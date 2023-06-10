package SolvingOnlinePracticeQuestions;

public class P7 {
    public static void main(String[] args) {
        /*
        Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
        To find area we multiply 2*3
        And find the perimeter -> P=2(l+w)=2·(3+2)=10
         */
        int a=2;
        int b=3;
         int area=a*b;
         int Perimeter = 2*(a+ b);

        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+Perimeter);
    }
}
