package Project2HWOtherWays;

import java.util.Arrays;

public class Anagrams {
   static boolean isAnagramSort(String string1, String string2) {
       string1= string1.replaceAll("\\s","").toLowerCase();
       string2=string2.replaceAll("\\s","").toLowerCase();
        if (string1.length() != string2.length()) {
            System.out.println(false);
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        String one="Dormitory ";
        String two="dirty room";
        String res= String.valueOf(isAnagramSort(one,two));
        System.out.println(res);
    }
}
