package Replit;

import java.util.Scanner;

public class R99SecondWay {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String str = inp.nextLine();
        str=str.replace(" ","");
        boolean isEqual = true;
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String reversed = sb.toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(isEqual);
        } else {
            System.out.println(!isEqual);
        }
    }
}
