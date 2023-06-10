package Class13HWDifferentWays;

public class Hw2Swap2StringsWithATempVar {
    public static void main(String[] args) {
        // Swapping two strings using third variable temp

        String s1 = "Hi";
        String s2 = "Hello";
        System.out.println("Before swapping \ns1 = " + s1 + " \ns2 = " + s2);

       String temp1 = s1;
        s1 = s2;
        s2 = temp1;
        System.out.println("After swapping,\ns1 = " +s1+ "\ns2 = "+s2 );

    }
}
