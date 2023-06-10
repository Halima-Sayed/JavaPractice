package Class13HWDifferentWays;

public class Hw1Way3 {
    public static void main(String[] args) {
    /*
         How would you reverse a String word by word? for example
          // input=>This is sentence i want to reverse
          // output=>sihT si ecnetnes i tnaw ot esrever
           */
        String str = "This is sentence i want to reverse";

        String[] word = str.split(" ");

        StringBuilder reverse = new StringBuilder();
        for (String t : word) {
            StringBuilder reverseWord = new StringBuilder(t).reverse();
            reverse.append(reverseWord).append(" ");
        }
        String str1 = reverse.toString();
        System.out.println(str1);
    }
}

